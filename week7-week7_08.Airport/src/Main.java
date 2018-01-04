import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful. 
        Scanner reader = new Scanner(System.in);
        FlightData data = new FlightData();
        AgentUI agentUI = new AgentUI(reader, data);
        PassengerUI passengerUI = new PassengerUI(reader, data);
        
        System.out.println("Airport panel");
        System.out.println("--------------------");
        agentUI.agentPrompt();
        System.out.println("Flight service");
        System.out.println("------------");
        passengerUI.userPrompt();
        

//        AgentUI agentui = new AgentUI(reader, data);
//        
//
//        System.out.println("Airport panel");
//        System.out.println("------------------------");
//        data.addPlane("HA-LOL", 211);
//        data.addPlane("LOl-JK", 23423);
//        planes = data.planes();
//        for(int i = 0; i<planes.size();i++){
//            System.out.println(planes.get(i));
//        }
//        data.addFlights("HA-LOL", "ur mom", "ur dad");
//        data.addFlights("HA-LOL", "RDU", "PDX");
//        data.addFlights("LOl-JK", "DEN", "RDU");
//        flights = data.flights();
//        for(int i = 0; i<flights.size();i++){
//            System.out.println(flights.get(i));
//        }
    }
}
