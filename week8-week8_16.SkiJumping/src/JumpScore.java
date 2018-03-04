/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.*;

public class JumpScore {
    HashMap<String, ArrayList<Integer>> scores = new HashMap<String, ArrayList<Integer>>();
        
    public JumpScore(){
        
    }
    
    public void createHashmap(ArrayList<Jumper> participants){
        //create a blank hashmap with each participant
        for(Jumper jumper: participants){
            scores.put(jumper.getName(), new ArrayList<Integer>());
        }
    }
    
    public void createScores(ArrayList<Jumper> participants){
        //placeholder to hold the 5 scores that are randomly generated
        int[] placeholderScores = new int[6];
        Random rand = new Random();
        int length;
        int score;
        
        //iterate through each jumper
        for(Jumper jumper: participants){
            System.out.println("  " + jumper.getName());
            length = rand.nextInt(60) + 60;
            //add jump length to the hashmap with names and scores
            scores.get(jumper.getName()).add(length);
            
            //print out the length of the jump
            System.out.println("    length: " + length); 
            
            //print out list of judge scores
            System.out.print("    judge votes: [");            
            //create array of 5 scores between 10 and 20 and print
            for(int i=0;i<5;i++){
                score = rand.nextInt(10) + 10;
                placeholderScores[i] = score;
                System.out.print(score);
                if(i<4){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            System.out.println("");
            placeholderScores[5] = length;
            Arrays.sort(placeholderScores);
            jumper.addPoints(placeholderScores);
        }
    }
    
    public ArrayList<Integer> lengths(String jumper){
        return scores.get(jumper);
    }
}
