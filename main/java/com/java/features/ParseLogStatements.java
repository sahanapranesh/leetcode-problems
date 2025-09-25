package com.java.features;

import java.util.*;

/**
 * You’re given a log file (list of strings like "userA,userB,100" meaning userA paid userB $100).
 * Return all users with net negative balance. Optimize for large inputs.
 */
public class ParseLogStatements {
    public static List<String> findNegativeBalances(List<String> logs) {
        Map<String, Integer> balance = new HashMap<>();

        for (String log : logs) {
            String[] parts = log.split(",");
            String from = parts[0], to = parts[1];
            int amount = Integer.parseInt(parts[2]);

            balance.put(from, balance.getOrDefault(from, 0) - amount);
            balance.put(to, balance.getOrDefault(to, 0) + amount);
        }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : balance.entrySet()) {
            if (entry.getValue() < 0) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result); // often expected in interviews
        return result;
    }
}
