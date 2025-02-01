import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String args[]){
        Map<Integer, Integer> h = new HashMap<>();
        h.put(1,1);
        h.put(2,2);
        System.out.println(h);
        System.out.println(h.keySet());
        System.out.println(h.get(1));

        /*
            HastTable is synchronized
         */
    }
}
