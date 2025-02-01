import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        Set<Integer> s = new TreeSet<> ();
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(3);
        System.out.println(s);
        s.remove(4);
        System.out.println(s);
    }
}
