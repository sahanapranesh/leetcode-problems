package com.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    private static String name = "sahana";

    public static boolean predTest(){
        Predicate<Integer> predicate = a -> a>10;
        Predicate<Integer> predicate2 = a -> a<100;
        return predicate.and(predicate2).test(90);
    }

    public static void functionTest(){
        Function<Integer, String> function = a -> "This is the number "+a;
        Function<Integer, Integer> function2 = a -> a*a;
        System.out.println(function2.andThen(function).apply(7));
        System.out.println(function.compose(function2).apply(7));
    }

    public static void main(String[] args) {
        System.out.println(predTest());
        name =  "Soumya";
        System.out.println(name);
        functionTest();
        List<String> names = Arrays.asList("sahana","aashvi","sahana","prakash");
        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map.entrySet());
    }
}
