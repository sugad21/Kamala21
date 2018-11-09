package com.example.pele_.kamala21;

import java.util.ArrayList;

public class RmPmPlayerInfo {
    private ArrayList<RmPmCard> hand;
    private int wins;
    private int standing;

    public RmPmPlayerInfo(){
        hand = new ArrayList<RmPmCard>(13);
        wins = 0;
        standing = -1;
    }

    public ArrayList<RmPmCard> getHand() {
        return hand;
    }
    public int getWins(){ return wins; }
    public int getStanding(){ return standing; }

    public void setHand(ArrayList<RmPmCard> in){ hand = in; }
    public void addCard(RmPmCard in){
        hand.add(in);
    }
    public boolean removeCard(RmPmCard in){
        if(hand.contains(in)){
            hand.remove(in);
            return true;
        }
        return false;
    }

    public void addWin(){
        wins++;
    }
    public void setWin(int amountWins) {wins = amountWins; }

    public void setStanding(int standingResult){
        standing = standingResult;
    }
}
