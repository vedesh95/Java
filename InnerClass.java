class Outer{
    int x;
    class Inner{
        private int y;
        Inner(int y){
            this.y=y;
        }
        public int getY(){
            System.out.println("inner class can access outer class unless its static");
            System.out.println("from inner: x is "+x);
            return this.y;
        }
    }
    static class InnerStatic{
        int z=10;
    }
}
public class InnerClass {
    public void demo(){
        Outer outer= new Outer();
        outer.x=5;
        Outer.Inner inner = outer.new Inner(6);
        System.out.println("x is "+outer.x + " y is " + inner.getY());

        // just like static attributes and methods, a static inner class does not have access to members of the outer class.
        
        // An inner class can also be static, which means that you can access it without creating an object of the outer class
        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        System.out.println("object of static class: z is "+innerStatic.z);
    }
}
