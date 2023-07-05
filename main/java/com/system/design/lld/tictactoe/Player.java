package com.system.design.lld.tictactoe;

import java.util.Objects;

public class Player {
    private String name;
    private int id;
    private String symbol;

    public String getNameBasedOnSymbol(String symbol) {
        if(Objects.equals(this.symbol, symbol)){
            return this.name;
        }
        return null;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
