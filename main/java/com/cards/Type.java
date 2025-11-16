package com.cards;

import java.util.List;

public class Type {
    private String value;
    private List<String> possibleValues = List.of("A","2","3","4","5","6","7","8","9","10","J","Q","K");

    public Type(String value) {
        if(possibleValues.contains(value)){
            this.value = value;
        }
    }

    @Override
    public String toString() {
        return "Type{" +
                "value='" + value + '\'' +
                '}';
    }
}
