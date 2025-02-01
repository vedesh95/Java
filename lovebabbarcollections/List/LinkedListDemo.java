import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
    public static void main(String [] args){
        List<Integer> arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.remove(0);
        System.out.println(arr);
        List<Integer> arr1 = new LinkedList<>();
        arr1.add(3);
        arr1.add(4);
        arr.addAll(arr1);
        System.out.println(arr);
        arr.removeAll(arr1);
        System.out.println(arr);

        System.out.println("size: " + arr.size());

        arr1.clear();
        System.out.println("size: " + arr1.size());



        System.out.println(arr);
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        LinkedList<Integer> arr3= new LinkedList<>();
        arr3.add(7);arr3.add(9);arr3.add(8);arr3.add(6);
        System.out.println(arr3.get(0));
        arr3.set(0,100);
        System.out.println(arr3);

        System.out.println(arr3.contains(1000));

        Object[] arr4 = arr3.toArray();
        for(Object o: arr4){
            System.out.print(o + " ");
        }

        System.out.println("Before starting" + arr3);
        Collections.sort(arr3, Collections.reverseOrder());
        System.out.println("After starting" + arr3);

        // List<Integer> arr5 = (ArrayList<Integer>)arr3.clone();
        // System.out.println(arr5);

        System.out.println(arr3.indexOf(1000));

        arr3.addLast(6);
        arr3.addFirst(100);
        System.out.println(arr3 + " " + arr3.lastIndexOf(100) + " " + arr3.getFirst()  + " " + arr3.getLast());
        System.out.println(arr3.peek());
        System.out.println(arr3.poll());
        System.out.println(arr3);

        arr3.removeFirst();
        arr3.removeLast();

    }
}
