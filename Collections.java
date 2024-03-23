import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

class DemoArrayList{
    public void demo(){
        System.out.println("\n-----ArrayList-----");
        ArrayList<String> cars = new ArrayList<String> ();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("McLaren");
        System.out.println(cars.get(0));
        cars.set(2,"Mustang");
        cars.remove(0);
        System.out.println(cars.size());
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        for(String i: cars){
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars.size());
    }
}

class DemoLinkedList{
    public void demo(){
        System.out.println("-----LinkedList-----");
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("McLaren");
        System.out.println(cars.get(0));
        cars.set(2,"Mustang");
        cars.remove(0);
        System.out.println(cars.size());
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        for(String i: cars){
            System.out.println(i);
        }
        cars.clear();
        System.out.println(cars.size());

        System.err.println("As seen above, all methods of ArrayList are valid here, as ArrayList and LinkedList both implement same List Interface");
        cars.addFirst("Audi");
        cars.addLast("BMW");
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.size());
    }
}

class DemoHashMap{
    public void demo(){
        System.out.println("-----HashMap-----");
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Netherlands","Amsterdam");
        hm.put("India","Delhi");
        hm.put("Norway", "Oslo");

        System.out.println(hm);
        System.out.println(hm.get("Netherlands"));
        hm.remove("India");
        System.out.println(hm.size());
        //print keys
        for(String i: hm.keySet()){
            System.out.println(i);
        }
        //print values
        for(String i:hm.values()){
            System.out.println(i);
        }
        hm.clear();
    }
}

class DemoHashSet{
    public void demo(){
        System.out.println("-----HashSet-----");
        HashSet<String> cars = new HashSet<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("McLaren");
        cars.add("BMW");
        cars.add("McLaren");
        System.err.println(cars.size());
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Tata"));
        cars.remove("McLaren");
        for(String i:cars){
            System.out.println(i);
        }
        cars.clear();

    }
}

class DemoIterator{
    public void demo(){
        System.out.println("-----Iterator-----");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("McLaren");

        //get iterator
        Iterator<String> it= cars.iterator();
        // Print first item
        System.out.println(it.next());
        while (it.hasNext()) {
            String s=it.next();
            if(s=="BMW"){
                it.remove();
            }
            System.out.println(it.next());
        }
    }
}

class DemoWrapperClass{
    public void demo(){
        System.out.println("-----Wrapper Class-----");
        ArrayList<Integer> arr = new ArrayList<>();
        Integer myInt = 5;
        System.out.println(myInt.intValue());
        String s = myInt.toString();
    }
}
public class Collections {
    public void demo(){
        DemoArrayList d = new DemoArrayList();
        d.demo();
        DemoLinkedList l= new DemoLinkedList();
        l.demo();
        DemoHashMap hm = new DemoHashMap();
        hm.demo();
        DemoHashSet hs = new DemoHashSet();
        hs.demo();
        DemoIterator it =new DemoIterator();
        it.demo();
        DemoWrapperClass wc = new DemoWrapperClass();
        wc.demo();
        
        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects
    }
}
