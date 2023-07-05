package com.java.features;

import java.time.LocalDate;

public interface DemoInterface {
    default String getName(){
        return "Sahana";
    }

    default String getJob(){
        return "Craftsperson";
    }

    default String getAge(){
        return "34";
    }

    static LocalDate getDate(){
        return LocalDate.now();
    }
}
