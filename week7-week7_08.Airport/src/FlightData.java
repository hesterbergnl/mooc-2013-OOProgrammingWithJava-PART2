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

public class FlightData {
    private HashMap<String, ArrayList<String>> flights = new HashMap<String, ArrayList<String>>();
    private HashMap<String, Integer> planes = new HashMap<String, Integer>();
    
    public FlightData(){
    
    }
    
    public void addPlane(String planeID, int capacity){
        this.planes.put(planeID, capacity);
        this.flights.put(getPlane(planeID), new ArrayList<String>());
    }
    
    public void addFlights(String planeID, String departureCity, String destinationCity){
        this.planes.get(planeID);
        this.flights.get(getPlane(planeID)).add("(" + departureCity + "-" + destinationCity + ")");
    }
    
    public String getPlane(String planeID){
        return planeID + " (" + this.planes.get(planeID) + " ppl)";
    }
    
    public ArrayList<String> flights(){
        ArrayList<String> flightList = new ArrayList<String>();
        String addString;
        
        for(String planeID: this.planes.keySet()){
            for(String item: this.flights.get(getPlane(planeID))){
                addString = getPlane(planeID);
                addString+= (" " + item);
                flightList.add(" " + addString);
            }
        }
        return flightList;
    }
    
    public ArrayList<String> planes(){
        ArrayList<String> planeList = new ArrayList<String>();
        
        for(String planeName: planes.keySet()){
            planeList.add(planeName + " (" + this.planes.get(planeName) + " ppl)");
        }
        return planeList;
    }
    
    public int printPlaneInfo(String planeIDGiven){
        return this.planes.get(planeIDGiven);
    }
}
