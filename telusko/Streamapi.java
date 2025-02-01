import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Streamapi {
    public static void main(String args[]){
        List<Integer> nums = Arrays.asList(5,4,3,2,1);
        nums.forEach(n -> System.out.print(n));
        System.out.println();

        Consumer<Integer> con = (Integer i) -> System.out.print(i);
        nums.forEach(con);
        System.out.println();

        nums.forEach(n -> System.out.print(n));
        System.out.println();


        System.out.println("Stream Demo");
        Stream<Integer> srm = nums.stream();
        srm.forEach(n -> System.out.print(n));
        System.out.println();

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        s2.forEach(n -> System.out.print(n));
        System.out.println();

        int res = nums.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e); 
        System.out.println(res);
        
    }
    
}
