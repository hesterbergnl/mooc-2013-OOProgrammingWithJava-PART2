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
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    
    public Dictionary(){
        
    }
    
    public String translate(String word){
        stringCleaner(word);
        return this.dictionary.get(word);
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dictionary.size();
    }
    
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> contents = new ArrayList<String>();
        //keySet is the array with all the keys
        for(String key: this.dictionary.keySet()){
            contents.add(key+"="+this.dictionary.get(key));
        }
        return contents;
    }
}
