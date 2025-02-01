import java.util.Stack;

public class StackDemo {
    public static void main(String [] args){
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
        System.out.println(s.search(2) + " " + s.search(100));   // returns 1 based index from last
        System.out.println(s.empty());
    }
}
