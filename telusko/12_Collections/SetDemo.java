import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]){
        Set<Integer> h = new HashSet<>();
        h.add(1);
        h.add(20);
        h.add(6);
        h.add(4);

        System.out.println(h);

        h = new TreeSet<>();
        h.add(1);
        h.add(20);
        h.add(6);
        h.add(4);

        System.out.println(h);
        
        Iterator<Integer> itr = h.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
