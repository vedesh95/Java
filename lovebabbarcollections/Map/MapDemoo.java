import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemoo {
    public static void main(String args[]){
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(1,1);
        mp.put(1,2);
        mp.put(2,2);
        System.out.println(mp);
        Map<Integer, Integer> mp2 = new HashMap<>();
        mp2.put(2,2);
        mp2.put(3,3);
        mp.putAll(mp2);
        System.out.println(mp);

        mp.remove(1);
        System.out.println(mp);

        mp.putIfAbsent(2,3);
        mp.putIfAbsent(4,4);
        System.out.println(mp);
        System.out.println(mp.getOrDefault(1, -1));

        System.out.println(mp.containsKey(2));
        System.out.println(mp.containsKey(5));
        System.out.println(mp.containsValue(2));

        mp.replace(2,22);
        System.out.println(mp);

        Set<Integer> s = mp.keySet();
        System.out.println(s);

        Collection<Integer> c = mp.values();
        System.out.println(c);

        Set<Map.Entry<Integer, Integer>> st= mp.entrySet();
        System.out.println(st);

        

    }
}
