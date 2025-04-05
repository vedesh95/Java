import java.util.Arrays;

class Bird{
    private int legs;
    public String name;
    private void displayDNA() { }
    public void canFly() {}

}
public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class birdClass = Class.forName("Bird");
        Class birdClass2 = Bird.class;

        System.out.println(birdClass2.getName());
        System.out.println(Arrays.toString(birdClass2.getFields()));

    }
}
