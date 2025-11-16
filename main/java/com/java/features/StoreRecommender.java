package com.java.features;

import java.util.*;

public class StoreRecommender {
        public static Map<String, Map<String, Integer>> buildCoOccurrence(List<List<String>> sessions) {
            Map<String, Map<String, Integer>> coOccurrence = new HashMap<>();

            for (List<String> session : sessions) {
                // Use a set to avoid counting duplicates within the same session
                Set<String> uniqueStores = new HashSet<>(session);

                List<String> stores = new ArrayList<>(uniqueStores);
                for (int i = 0; i < stores.size(); i++) {
                    for (int j = i + 1; j < stores.size(); j++) {
                        String s1 = stores.get(i);
                        String s2 = stores.get(j);

                        // Update s1 -> s2
                        coOccurrence
                                .computeIfAbsent(s1, k -> new HashMap<>())
                                .merge(s2, 1, Integer::sum);

                        // Update s2 -> s1
                        coOccurrence
                                .computeIfAbsent(s2, k -> new HashMap<>())
                                .merge(s1, 1, Integer::sum);
                    }
                }
            }

            return coOccurrence;
        }

        public static void main(String[] args) {
            List<List<String>> sessions = Arrays.asList(
                    Arrays.asList("Walmart", "Target", "BestBuy"),
                    Arrays.asList("Walmart", "Costco"),
                    Arrays.asList("Target", "Sephora", "BestBuy"),
                    Arrays.asList("Walmart", "Sephora")
            );

            Map<String, Map<String, Integer>> result = buildCoOccurrence(sessions);

            // Print results
            for (String store : result.keySet()) {
                System.out.println(store + " -> " + result.get(store));
            }
        }

}
