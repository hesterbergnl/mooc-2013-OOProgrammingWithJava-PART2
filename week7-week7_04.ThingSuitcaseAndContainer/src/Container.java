/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikolai
 */
import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private int totalWeight = 0;
    
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight; 
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight + suitcase.totalWeight() <= this.maxWeight){
            this.container.add(suitcase);
            this.totalWeight+=suitcase.totalWeight();
        }
    }
    
    public String toString(){
        return this.container.size() + " suitcases (" + this.totalWeight + " kg)";
    }
   
    public void printThings(){
        for(Suitcase suitcase: container){
            suitcase.printThings();
        }
    }
    
}
