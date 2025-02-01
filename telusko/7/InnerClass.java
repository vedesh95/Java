class Outer{
    public void show(){
        System.out.println("In show outer");
    }
    class Inner{
        void show(){
            System.out.println("In show inner");
        }
    }
}
public class InnerClass{
    public static void main(String args[]){
        Outer o = new Outer();
        Outer.Inner i = o. new Inner();
        o.show();
        i.show();
    }
}
