import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListDemo {
    public static void main(String args[]){
        Set<Integer> s = new LinkedHashSet<>();
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(3);
        System.out.println(s);
        s.remove(4);
        System.out.println(s);
    }
}
