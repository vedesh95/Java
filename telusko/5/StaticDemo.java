class Calc{
    public static String name;
    static{
        name = "CalculatorName";
    }
    public double add(double x, double y){
        return x + y;
    }
    public int add(int x,int y){
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
    public int mul(int x,int y){
        return x*y;
    }
    public int div(int x,int y){
        return x/y;
    }
}

class Demo {
    public static String name;
    public int id;
    static{
        System.out.println("In static block");
        name = "vedesh";
    }
    public static void show(Demo sd){
        System.out.println(name + " " + sd.id);
    }
}

public class StaticDemo{
    public static void main(String [] args){
        //static variables
        Calc calc = new Calc();
        Calc.name = "Casio";
        System.out.println(calc.name);
        
        //when no objects are created static variables are accessed then static block runs. Its because class is loaded at that time
        System.out.println(Demo.name);
        
        //to load the class without calling static methods or variables
        // try {
        //     Class.forName("Demo");
        // } catch (ClassNotFoundException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        Demo sd =  new Demo();
        Demo.show(sd);
    }
}
