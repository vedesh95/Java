class Animal{
    public void makeSound(){
        System.out.println("This is sound of an Animal");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bow Bow!!");
    }
}

class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow Meow!!");
    }
}

public class Polymorphism {
    public void demo(){
        Animal  animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
    
}
