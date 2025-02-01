interface Computer{
    public void info();
}

class Laptop implements Computer{
    public void info(){
        System.out.println("I am Laptop");
    }
}
class Desktop implements Computer{
    public void info(){
        System.out.println("I am Desktop");
    }
}
public class Interface {
    public static void main(String args[]){
        Computer c = new Laptop();
        c.info();
        c = new Desktop();
        c.info(); 

        /*
         * all variables in interface are by default static and final
         * methods are public and abstract
         * interface to interface can only extends not implements
         */

         /*
          * types of interfaces
                normal 
                functionsal SAM
                Marker
          */
    }
}
