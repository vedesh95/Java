interface FirstInterface{
    public void firstMethod();
    public void secondMethod();
}

interface SecondInterface{
    public void thirdMethod();
    public void fourthMethod();
}

class InterfaceClass implements FirstInterface, SecondInterface{
    //Interface methods are by default abstract and public
    //Interface attributes are by default public, static and final
    public void firstMethod(){
        System.out.println("this is first method!");
    }
    public void secondMethod(){
        System.out.println("this is second method!");
    }
    public void thirdMethod(){
        System.out.println("this is third method!");
    }
    public void fourthMethod(){
        System.out.println("this is fourth method!");
    }

}

public class Interface{
    public void demo(){
        InterfaceClass interfaceClass= new InterfaceClass();
        interfaceClass.firstMethod();
        interfaceClass.secondMethod();
        interfaceClass.thirdMethod();
        interfaceClass.fourthMethod();
    }
}