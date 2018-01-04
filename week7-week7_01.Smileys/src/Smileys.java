
public class Smileys {

    public static void main(String[] args) {
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        int length = characterString.length();
        int numCharacters, numSmileys;
        

        if(length%2 == 0){
            numCharacters = length + 2;
        }
        else{
            numCharacters = length + 3;
        }
        numSmileys = (numCharacters/2) + 2;
        
        for(int i=0;i<numSmileys;i++){
            System.out.print(":)");
        }
        System.out.println("");
        
        if(length%2 == 0){
            System.out.println(":) " + characterString + " :)");
        }
        else{
            System.out.println(":) " + characterString + "  :)");
        }
         
        for(int i = 0;i<numSmileys;i++){
            System.out.print(":)");
        }
        System.out.println("");
    }
}
