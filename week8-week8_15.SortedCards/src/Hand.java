/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<Card>();
    
    public Hand(){

    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card: hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    @Override
    public int compareTo(Hand hand){  //compares two different hands
        int sum1,sum2;
        
        sum1 = this.sum();  
        sum2 = hand.sum();
        return sum1-sum2;
    }
    
    private int sum(){  //sums up the total value of the hands
        int sum = 0;
        
        for(Card card: this.hand){
            sum += card.getValue();
        }
        return sum;
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
