package com.example.pele_.kamala21;

import java.util.ArrayList;
import java.util.Collections;

public class RmPmDeck {
    private ArrayList<RmPmCard> deck;
    private int playerCount;

    public RmPmDeck(int numPlayers){
        playerCount = numPlayers;
        deck = new ArrayList<RmPmCard>();
        String suit = "Default";
        for(int i = 0; i < numPlayers; i++){ //changes amount of cards based on amount of players
            if(i == 0){
                suit = "hearts";
            } else if(i == 1){
                suit = "clubs";
            } else if(i == 2){
                suit = "diamonds";
            } else if(i == 3){
                suit = "spades";
            } else if(i == 4){
                suit = "hearts";
            } else if(i == 5){
                suit = "clubs";
            }
            for(int j = 0; j < 13; j++){ //each suit has 13 cards
                RmPmCard card = new RmPmCard(j, suit);
                deck.add(card);
            }
        }
        Collections.shuffle(deck);
    }

    public ArrayList<RmPmCard> getDeck() {
        return deck;
    }

    public int size(){
        return deck.size();
    }

    public RmPmCard remove(int index){
        return deck.remove(index);
    }

}
