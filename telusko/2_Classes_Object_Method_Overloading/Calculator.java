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
public class Calculator{
    public static void main(String args[]){
        Calc calc = new Calc();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.add(10.0, 5.0)); //operator overloading
    }
}