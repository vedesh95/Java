interface D{
    int add(int i, int j);
}
public class LambdaDemo {
    public static void main(String args[]){
        D d = (i,j) -> i + j;
        System.out.println(d.add(5,4));
    }
}
//refer FunctionalInterface.java for one more Demo