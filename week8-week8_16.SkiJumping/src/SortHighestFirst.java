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

public class SortHighestFirst implements Comparator<Jumper>{
    
    public int compare(Jumper jumper1, Jumper jumper2){
        return jumper2.getScore() - jumper1.getScore();
    }
}
