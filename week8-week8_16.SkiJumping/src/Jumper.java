/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
public class Jumper implements Comparable<Jumper> {
    String name;
    int score;
    
    public Jumper(String name){
        this.name = name;
        this.score = 0;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPoints(int[] scores){
        //iterate through scores and add scores that aren't first or last
        for(int i = 1; i<4; i++){
            this.score += scores[i];
        }
        //add the length (scores[6])
        this.score += scores[5];
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.score + " points)";
    }
    
    @Override
    public int compareTo(Jumper jumper){
        return this.score - jumper.score;
    }
    
}
