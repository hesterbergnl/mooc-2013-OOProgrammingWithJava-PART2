/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikolai
 */

import java.util.HashMap;
import java.util.Map;



public class PromissoryNote {

    private HashMap<String, Double> promissoryNote = new HashMap<String, Double>();
       
    public PromissoryNote(){
        
    }
    
    public void setLoan(String toWhom, double value){
        this.promissoryNote.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        stringCleaner(whose);
        if(this.promissoryNote.containsKey(whose)){
            return this.promissoryNote.get(whose);
        }
        return 0;
    }       
    
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
