
public class Main {

    public static void main(String[] args) {
        // write some test code here
        Storehouse store = new Storehouse();
        store.addProduct("diaper", 5, 1);
        store.addProduct("gum", 1, 4);
        System.out.println(store.price("diaper"));
        System.out.println(store.price("cantalope"));
        System.out.println(store.stock("cantalope"));
    }
}
