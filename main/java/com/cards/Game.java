package com.cards;

import java.util.*;

public class Game {

    public static void shuffle(){
        Set<Card> cards = new HashSet<>();
        List<String> possibleValues = List.of("A","2","3","4","5","6","7","8","9","10","J","Q","K");
        List<Symbol> symbols = List.of(Symbol.SPADE, Symbol.CLOVER, Symbol.DIAMOND, Symbol.HEART);
        Card card = null;
        Random random = new Random();
        random.ints(0,13);
        random.ints(0,13);
        for(int i=0; i<13; i++){
            int index2 = random.nextInt();
                Type type = new Type(possibleValues.get(index2));
                int index = i > 3 ? 2 : i;
                card = new Card(symbols.get(index), type);
                cards.add(card);
        }
        System.out.println(cards);
    }

    public static void main(String[] args) {
        shuffle();
    }

}
