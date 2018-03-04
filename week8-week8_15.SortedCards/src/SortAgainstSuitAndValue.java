/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card>{
    public int compare(Card card1, Card card2){
        int compareVal; //the integer value to return
        
        compareVal = card1.getSuit() - card2.getSuit();
        if(compareVal == 0){
            compareVal = card1.getValue() - card2.getValue();
        }
        return compareVal;
    }
}
