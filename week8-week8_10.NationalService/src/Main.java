public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService civil = new CivilService();
        civil.work();
        civil.work();
        System.out.println(civil.getDaysLeft());
        civil.work();
        MilitaryService military = new MilitaryService(civil.getDaysLeft());
        military.work();
        System.out.println(military.getDaysLeft());
        
    }
}
