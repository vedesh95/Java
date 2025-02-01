import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String args[]){
        Queue<Integer> q = new PriorityQueue<>((a,b) -> a-b);
        q.add(1);
        q.add(4);
        q.add(3);
        
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        
    }
}
