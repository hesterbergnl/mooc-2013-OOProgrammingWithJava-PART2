
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        //container.printThings();
        System.out.println(container);
    }
            
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each

        for(int i=1;i<=100;i++){
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
        
    }
}

