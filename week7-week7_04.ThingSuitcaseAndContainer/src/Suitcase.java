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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){
        if((this.totalWeight() + thing.getWeight()) <= this.maxWeight){
            this.things.add(thing);
        }
    }
    
    public String toString(){
        if(this.things.size() == 0){
            return "empty (0 kg)";
        }
        else if(this.things.size() == 1){
            return "1 thing (" + this.totalWeight() + " kg)";
        }
        else{
            return this.things.size() + " things (" + this.totalWeight() + " kg)";
        }
    }
    
    public void printThings(){
        for(Thing thing: this.things){
            System.out.println(thing);
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing item: things){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if(things.isEmpty()){
            return null;
        }
        int highestWeight = things.get(0).getWeight();
        Thing heaviest = things.get(0);
        
        for(Thing item: things){
            if(item.getWeight() > highestWeight){
                highestWeight = item.getWeight();
                heaviest = item;
            }
        }
        return heaviest;
    }
}
