abstract class Car{
    public void hasWheels(){
        System.out.println("I have wheels");
    }
    public abstract void drive();
}

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}


public class Abstract{
    public static void main(String args []){
        Car wr = new WagonR();
        wr.hasWheels();
        wr.drive();
    }
}