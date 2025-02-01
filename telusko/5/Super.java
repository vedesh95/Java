class A extends Object{
    A(){
        System.out.println("A constructor");
    }
    A(int a){
        System.out.println("A parameteized constructor");
    }
}
class B extends A{
    B(){
        this(5);
        System.out.println("B constructor");
    }
    B(int b){
        super(b);
        System.out.println("B parameteized constructor");
    }
}
public class Super {
    public static void main(String args[]){
        B obj1 = new B();
        System.out.println("---");
        B obj2 = new B(5);
        System.out.println("---Anonymous object---");
        new B(); //anonymous object. Can't reference it

        /*
         * static methods can contain only access static members
         * static members accessible in static and non-static methdds
         * every class in java extends Object
        */

        /*
         * Casing
         * class and Interface -> first letter capitalized
         * variables and metods => first letter small
        */
    }    
}
