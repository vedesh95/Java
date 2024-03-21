import javax.print.DocFlavor.STRING;

class Vehicle{
    protected String brand;
    public void honk(){
        System.out.println("Honk !!");
    }
} 
public class Car extends Vehicle{
    private String model;
    public Car(String brand, String model){
        this.model=model;
        this.brand=brand;
    }
    public void getCar(){
        this.honk();
        System.out.println("Car of brand "+this.brand + " and model is "+this.model);
    }
}