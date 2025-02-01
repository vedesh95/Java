class A{
    public void show(){
        System.out.println("A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("B");
    }
}
public class Annotation {
    public static void main(String args[]){
        A a = new A();
        a.show();
        a = new B();
        a.show();
    }
}
