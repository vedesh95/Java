class OOPS {
    public void main(){

        System.out.println("Demonstrating OOPS Basics");
        OOPSBasics obj = new OOPSBasics();
        System.out.println(obj.x); 
        obj.main();

        //Constructor
        System.out.println("\ndemonstrating constructor");
        Constructor constructor = new Constructor(1, 2);
        constructor.main();
        
        // The public keyword is used to set the access level for classes, attributes, methods and constructors.

        //for classes
        //public	=> The class is accessible by any other class	
        //default	=> The class is only accessible by classes in the same package.

        //for attributes, methods and constructors within a class
        //public	The code is accessible for all classes	
        //private	The code is only accessible within the declared class	
        //default	The code is only accessible in the same package. 
        //protected	The code is accessible in the same package and subclasses. 

        //for attributes, methods and constructors within a class
        //final	Attributes and methods cannot be overridden/modified
        //static	Attributes and methods belongs to the class, rather than an object

        //final => inheritance of this class not possible
        //abstract class=> no objects
        //abstract method => child classes have to declare method abstract or override it


        //packages
        // javac MyPackageClass.java
        // javac -d . MyPackageClass.java
        // java mypack.MyPackageClass

        // import package.name.Class;   // Import a single class
        // import package.name.*;   // Import the whole package

        //inheritance
        Car car = new Car("Ford","Mustang");
        car.getCar();

        //polymorpism
        Polymorphism p = new Polymorphism();
        p.demo();

        //Inner Class
        //An inner class can also be static, which means that you can access it without creating an object of the outer class
        // just like static attributes and methods, a static inner class does not have access to members of the outer class.
        InnerClass innerClass = new InnerClass();
        innerClass.demo();

        //Abstract
        //Abstract method: can only be used in an abstract class
        //abstract class can have both abstract methods and regular methods
        //not demoing it cause its easy enough

        //interfaces
        //Interface methods are by default abstract and public
        //Interface attributes are by default public, static and final
        Interface ifc = new Interface();
        ifc.demo();
        
        //enum
        //enum is a special class. contains various constants(like final variables). constant's name should be in UPPERCASE
        ENUM enm = new ENUM();
        enm.demo();
        //enum can, just like class have attributes and methods.
        //enum constants are public, static and final (unchangeable - cannot be overridden).
        // An enum cannot be used to create objects
        //cannot extend other classes 
        //but it can implement interfaces
    }
}
