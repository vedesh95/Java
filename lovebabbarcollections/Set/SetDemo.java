import java.util.*;

public class SetDemo {
    public static void main(String args[]){
        Set<Integer>  s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        Set<Integer>  s2 = new HashSet<>();
        s2.add(2);
        s2.add(3);
        s2.add(4);

        s1.retainAll(s2);
        System.out.println(s1);
        System.out.println(s1.containsAll(s2));

        Set<Student> s3 = new HashSet<>();
        s3.add(new Student(1, "vedesh"));
        s3.add(new Student(1, "vedesh"));
        s3.add(new Student(1, "vedesh"));
        System.out.println(s3);
    }
}
