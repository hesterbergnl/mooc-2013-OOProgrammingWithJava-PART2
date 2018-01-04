/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikolai
 */
public class Calculator {
    private int totalCalcs;
    private Reader reader = new Reader();

    
    public Calculator(){
        
    }
    
    public void start() {
        this.totalCalcs = 0;
        
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                this.totalCalcs++;
            } else if (command.equals("difference")) {
                difference();
                this.totalCalcs++;
            } else if (command.equals("product")) {
                product();
                this.totalCalcs++;
            }
        }

        statistics();
    }
    
    private void sum(){
       System.out.print("value1: ");
       int value1 = reader.readInteger();  // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();  // read the value using the Reader-object
  
       System.out.println("Sum of the values " + (value1+value2));
    }
    
    private void product(){
       System.out.print("value1: ");
       int value1 = reader.readInteger();  // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();  // read the value using the Reader-object
       
       System.out.println("product of the values " + (value1*value2));
    } 
    
    private void difference(){
       System.out.print("value1: ");
       int value1 = reader.readInteger();  // read the value using the Reader-object
       System.out.print("value2: ");
       int value2 = reader.readInteger();  // read the value using the Reader-object
       
       System.out.println("difference of the values " + (value1-value2));
    }
    
    private void statistics(){
        System.out.println("Calculations done " + this.totalCalcs);
    }
}
