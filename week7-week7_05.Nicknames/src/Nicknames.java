
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> nickNames = new HashMap<String,String>();
        nickNames.put("matti", "mage");
        nickNames.put("mikael", "mixu");
        nickNames.put("arto","arppa");
         
        System.out.println(nickNames.get("mikael"));
    }

}
