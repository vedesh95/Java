import java.util.*;

import java.util.Comparator;
class ParentComparator implements Comparator<Parent> {
    public int compare(Parent p1, Parent p2){
        if(p1.id==p2.id){
            return p1.name.compareTo(p2.name);
        }
        return p1.id - p2.id;
    }
}

public class ArrayListDemo {
    public static void main(String [] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.remove(0);
        System.out.println(arr);
        List<Integer> arr1 = new ArrayList<>();
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

        List<Integer> arr3= new ArrayList<>();
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


        ArrayList<Parent> arr5 = new ArrayList<>();
        arr5.add(new Parent(1, "vedesh"));
        arr5.add(new Parent(1, "ankit"));
        arr5.add(new Parent(2, "zebra"));
        arr5.add(new Parent(3, "lion"));

        // Collections.sort(arr5, new Comparator<Parent>() {
        //     @Override
        //     public int compare(Parent p1, Parent p2){
        //         if(p1.id==p2.id){
        //             return p1.name.compareTo(p2.name);
        //         }
        //         return p1.id - p2.id;
        //     }
        // });
        Collections.sort(arr5, new ParentComparator());

        System.out.println(arr5);

    }
}
