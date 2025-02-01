@FunctionalInterface
interface C{
    void show(String a);
}
public class FunctionalInterfaceDemo {
    public static void main(String args[]){
        C c = new C(){
            public void show(String a){
                System.out.println("Inner Anonymous Class!" + " " + a);
            }
        };
        c.show("arg");

        C c1 = (String a) -> System.out.println("Lambda" + " " + a);
        c1.show("arg");
    }
}
