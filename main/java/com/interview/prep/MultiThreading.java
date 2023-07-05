package com.interview.prep;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class MultiThreading {
    public static void testMultiThreading(){
        Map<String, Integer> test = new HashMap<>();
        test.put("test", 0);
        for(int i=0; i<10; i++) {
            ExecutorService executorService = Executors.newFixedThreadPool(4);
            executorService.execute(() -> {
                System.out.println("updating the value");
                test.computeIfPresent("test", (key, value) -> value + 1);
                System.out.println(test.get("test"));
            });
            executorService.shutdown();
        }
    }



    public static void main(String[] args) {
        testMultiThreading();
    }

}
