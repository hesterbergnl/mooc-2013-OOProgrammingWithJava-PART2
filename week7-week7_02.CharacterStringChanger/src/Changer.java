/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikolai
 */
import java.util.*;

public class Changer {
    ArrayList<Change> changeList = new ArrayList<Change>();
    
    public Changer(){
        
    }
    
    public void addChange(Change change){
        changeList.add(change);
    }
    
    public String change(String characterString){
        
        for(Change individualChange: changeList){
            characterString = individualChange.change(characterString);
        }
        return characterString;
    }
}
