abstract class Anon{
    public abstract void show();
}
public class InnerAnonymous {
    public static void main(String args []){
        Anon a = new Anon(){
            public void show(){
                System.out.println("In Anon Inner show...");
            }
        };
    a.show();
    //object of anonymous inner class
    }
}
