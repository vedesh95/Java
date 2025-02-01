class AA{
    public void show(){
        System.out.println("A Class");
    }
}

class BB extends AA{
    public void show(){
        System.out.println("B Class");
    }
}

class Poly {
    public void demo(){
        AA a = new AA();
        a.show();
        a = new BB();
        a.show(); 
    }
    public String toString(){
        return "Poly Object";
    }
}

public class Polymorphism{
    public static void main(String args[]){
        Poly p = new Poly();
        p.demo();
        System.out.println(p);

        //even though objects have same data they don't share memory
        Poly poly1 = new Poly();
        Poly poly2 = new Poly();
        System.out.println(poly1.hashCode() + " " + poly2.hashCode());

        /*
         * overloading -> compile time polymorphism 
         * overriding -> runtime polymorphsim
         * final class -> no one can inherit
         * upcast and downcast
         * abstract methods can only be in abstract classes
         * abstract classes can contain abstract and non abstrat methods
         */
    }
}