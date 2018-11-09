package com.example.pele_.kamala21;

import java.util.*;

public class RmPmGameState {
    //arraylist of cards already played
    private ArrayList<RmPmCard> playedCards;
    // arraylist of players
    private ArrayList<RmPmPlayerInfo> players;
    //the cards of the current set
    private ArrayList<RmPmCard> currentSet;
    //a set used by the player to check if their move is valid
    private ArrayList<RmPmCard> playerSet;
    //an int that tells whose move it is
    private int currentPlayer;
    //an int to remember who the last person to play a card was
    private int lastPlayed;

    public RmPmGameState()
    {
        // initialize the state to be a brand new game

        RmPmDeck deck = new RmPmDeck(4);
        Collections.shuffle(deck.getDeck());
        //make an empty list of cards for starting playedCards
        playedCards = new ArrayList<RmPmCard>();
        //make an empty list of player info
        players = new ArrayList<RmPmPlayerInfo>();
        for(int i = 0; i < 4; i++){
            RmPmPlayerInfo temp = new RmPmPlayerInfo();
            players.add(temp); //adds 4 temp players to the players array list
        }
        //add the cards from the deck into the players list
        int j = 0;
        int size = deck.size();
        for(int i = 0; i < size; i++){
            players.get(j).addCard(deck.remove(0));
            if(j < players.size()-1){
                j++;
            } else{
                j = 0;
            }
        }
        //make the current set an empty arraylist of cards
        currentSet = new ArrayList<RmPmCard>();
        //make the player set an empty arraylist of cards
        playerSet = new ArrayList<RmPmCard>();
        // make it player 0's move
        currentPlayer = 0;
        // make lastPlayed to be something
        lastPlayed = -1;
    }// constructor

    /**
     * Constructor for objects of class RmPmGameState
     */
    public RmPmGameState(int numPlayers)
    {
        // initialize the state to be a brand new game

        RmPmDeck deck = new RmPmDeck(numPlayers);
        Collections.shuffle(deck.getDeck());
        //make an empty list of cards for starting playedCards
        playedCards = new ArrayList<RmPmCard>();
        //make an empty list of player info
        players = new ArrayList<RmPmPlayerInfo>();
        for(int i = 0; i < numPlayers; i++){
            RmPmPlayerInfo temp = new RmPmPlayerInfo();
            players.add(temp); //adds 4 temp players to the players array list
        }
        //add the cards from the deck into the players list
        int j = 0;
        int size = deck.size();
        for(int i = 0; i < size; i++){
            players.get(j).addCard(deck.remove(0));
            if(j < players.size()-1){
                j++;
            } else{
                j = 0;
            }
        }
        //make the current set an empty arraylist of cards
        currentSet = new ArrayList<RmPmCard>();
        //make the player set an empty arraylist of cards
        playerSet = new ArrayList<RmPmCard>();
        // make it player 0's move
        currentPlayer = 0;
        // make lastPlayed to be something
        lastPlayed = -1;
    }// constructor

    /**
     * Copy constructor for class RmPmState
     *
     * @param original
     * 		the RmPmState object that we want to clone
     */
    public RmPmGameState(RmPmGameState original)
    {
        //copy the instance variables of the original
        playedCards = new ArrayList<RmPmCard>();
        for(int i = 0; i < original.getPlayedCards().size(); i++){
            playedCards.add(original.getPlayedCards().get(i));
        }
        players = new ArrayList<RmPmPlayerInfo>();
        for(int i = 0; i < original.getPlayers().size(); i++){
            players.add(original.getPlayers().get(i));
        }
        currentSet = new ArrayList<RmPmCard>();
        for(int i = 0; i < original.getCurrentSet().size(); i++){
            currentSet.add(original.getCurrentSet().get(i));
        }
        playerSet = new ArrayList<RmPmCard>();
        currentPlayer = original.getCurrentPlayer();
        lastPlayed = original.getLastPlayed();
    }

    public ArrayList<RmPmCard> getPlayedCards(){ return playedCards; }
    public ArrayList<RmPmPlayerInfo> getPlayers(){ return players; }
    public ArrayList<RmPmCard> getCurrentSet(){ return currentSet; }
    public ArrayList<RmPmCard> getPlayerSet(){ return playerSet; }
    public int getCurrentPlayer(){ return currentPlayer; }
    public int getLastPlayed(){ return lastPlayed; }

    public void setPlayedCards(ArrayList<RmPmCard> in){ playedCards = in; }
    public void setPlayers(ArrayList<RmPmPlayerInfo> in){ players = in; }
    public void setCurrentSet(ArrayList<RmPmCard> in){ currentSet = in; }
    public void setPlayerSet(ArrayList<RmPmCard> in){ playerSet = in; }
    public void setCurrentPlayer(int in){ currentPlayer = in; }
    public void setLastPlayed(int in){ lastPlayed = in; }

    public boolean gameDone(){
        for(int i = 0; i < players.size(); i++){
            if(players.get(i).getHand().size() > 0){
                return false;
            }
        }
        return true;
    }
}
