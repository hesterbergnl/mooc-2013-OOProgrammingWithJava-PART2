import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        int roundCount = 1;
        ArrayList<Jumper> participants = new ArrayList<Jumper>();
        JumpScore scoreMaker = new JumpScore();
        
        String name;

        //prompt user for the names of participants
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while(true){
            System.out.println("  Participant name:");
            name = reader.nextLine();
            if(name.isEmpty()){
                break;
            }
            participants.add(new Jumper(name));
        }
        
        scoreMaker.createHashmap(participants);
        
        //start the UI for the jump competition
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        while(true){
            System.out.println("Write \"jump\" to jump; otherwise you quit:");    
            if(!reader.nextLine().equalsIgnoreCase("jump")){
                break;
            }
            System.out.println("");
            System.out.println("Jumping order:");
            Collections.sort(participants);
            
            int i = 1;
            
            for(Jumper jumper: participants){
                System.out.println("  "+ i + ". " + jumper);
            }
            System.out.println("");
            System.out.println("Results of round " + roundCount);
            scoreMaker.createScores(participants);
            roundCount += 1;
        }
        
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(participants, new SortHighestFirst());
        int i = 1;
        for(Jumper jumper: participants){
            System.out.println(i + "           " + jumper.toString());
            System.out.print("            jump lengths: ");
            int j = 1;
            for(int score : scoreMaker.lengths(jumper.getName())){
                System.out.print(score + " m");
                if(j != scoreMaker.lengths(jumper.getName()).size()){
                    System.out.print(", ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }
    
}
