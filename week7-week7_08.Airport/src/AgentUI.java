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

public class AgentUI {
    private Scanner reader;
    private FlightData data;
    private String input = "";
    
    public AgentUI(Scanner reader, FlightData data){
        this.data = data;
        this.reader = reader;
    }
    
    public void agentPrompt(){
        while(!input.toLowerCase().contains("x")){
            this.input = promptUser();
            if(this.input.toLowerCase().contains("1")){
                addAirplane();
            }
            else if(this.input.toLowerCase().contains("2")){
                addFlight();
            }
        }
    }
    
    private String promptUser(){
        String userInput;
        
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        userInput = reader.nextLine();
        System.out.println("");
        return userInput;
    }
    
    private void addAirplane(){
        String id;
        int capacity;
        System.out.println("Give plane ID: ");
        id = reader.nextLine();
        System.out.println("Give plane capacity: ");
        capacity = Integer.parseInt(reader.nextLine());
        data.addPlane(id, capacity);
    }
    
    private void addFlight(){
        String planeID;
        String departureAirport;
        String destinationAirport;
        
        System.out.println("Give plane ID: ");
        planeID = reader.nextLine();
        System.out.println("Give departure airport code: ");
        departureAirport = reader.nextLine();
        System.out.println("Give destination airport code: ");
        destinationAirport = reader.nextLine();
        data.addFlights(planeID, departureAirport, destinationAirport);
    }
}
