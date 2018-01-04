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

public class PassengerUI {
    private Scanner reader;
    private FlightData data;
    private String input = "";
    public PassengerUI(Scanner reader, FlightData data){
        this.reader = reader;
        this.data = data;
    }
    
    public void userPrompt(){
        
        
        while(!this.input.toLowerCase().contains("x")){
            input = promptUser();   
            if(this.input.toLowerCase().contains("1")){
                printPlanes();
            }
            else if(this.input.toLowerCase().contains("2")){
                printFlights();
            }
            else if(this.input.toLowerCase().contains("3")){
                printPlaneInfo();
            }
        }
    }
    
    private String promptUser(){
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
        return reader.nextLine();
    }
    
    public void printPlanes(){
        ArrayList<String> planes;
        planes = this.data.planes();
        for(int i = 0; i<planes.size();i++){
            System.out.println(planes.get(i));
        }
        System.out.println("");
    }
    
    public void printFlights(){
        ArrayList<String> flights;
        flights = this.data.flights();
        
        for(int i = 0; i<flights.size();i++){
            System.out.println(flights.get(i));
        }
        System.out.println("");
    }
    
    public void printPlaneInfo(){
        String planeID;
        System.out.println("Give plane ID: ");
        planeID = reader.nextLine();
        System.out.println(this.data.getPlane(planeID));
        System.out.println("");
    }
}
