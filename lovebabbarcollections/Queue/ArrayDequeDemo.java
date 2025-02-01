import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String args[]){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(2);
        dq.offerFirst(1);
        dq.offerLast(3);
        dq.pollFirst();
        System.err.println(dq);
        dq.pollLast();
        System.err.println(dq);

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}
