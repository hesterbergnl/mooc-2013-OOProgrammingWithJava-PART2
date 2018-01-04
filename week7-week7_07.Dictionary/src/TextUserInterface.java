/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikolai
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        String command;
        System.out.println("Statement:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        
        
        while(true){
            System.out.println("Statement: ");
            command = reader.nextLine();
            stringCleaner(command);
            if(command.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if(command.equals("add")){
                add();
            }
            else if(command.equals("translate")){
                translate();
            }
            else{
                System.out.println("Unknown statement");
            }        
        }
    }
    
    private void add(){
        String word;
        String translation;
        
        System.out.println("In Finnish: ");
        word = this.reader.nextLine();
        System.out.println("Translation: ");
        translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }
    
    private void translate(){
        String word;
        String translation;
        
        System.out.println("Give a word: ");
        word = this.reader.nextLine();
        translation = this.dictionary.translate(word);
        System.out.println("Translation: " + translation);
    }
    
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
