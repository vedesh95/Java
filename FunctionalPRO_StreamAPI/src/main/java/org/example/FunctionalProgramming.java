package org.example;

import java.util.Objects;
import java.util.function.*;

class AddThree implements Function<Long, Long>{
    @Override
    public Long apply(Long a){
        return a+3;
    }
}

class CheckForNull implements Predicate {
    @Override
    public boolean test(Object o) {
        return o != null;
    }
}

class Person{
    public String name;
    public Person(String name) {
        this.name = name;
    }
}

public class FunctionalProgramming {
    public void run(){

//        implement the Function interface
        Function<Long, Long> addThree = new AddThree();
        System.out.println(addThree.apply((long) 4));

//        implement the Function interface using a Java lambda expression.
        Function<Long, Long> adder = a -> a+3;
        System.out.println(adder.apply((long) 4));

        CheckForNull checkForNull = new CheckForNull();
        System.out.println(checkForNull.test(adder));

//        Prediate
        Predicate check = a -> a != null;
        System.out.println(check.test(adder));

//        UnaryOperator
        UnaryOperator<Person> unaryOperator =
                (person) -> { person.name = "New Name"; return person; };
        Person person = new Person("Old Name");
        unaryOperator.apply(person);
        System.out.println(person.name);

//        BinaryOperator
        BinaryOperator<Person> binaryOperator = (a,b) -> {a.name=a.name + " " + b.name;return a;};
        person = binaryOperator.apply(new Person("a"), new Person("b"));
        System.out.println(person.name);

//        Supplier
        Supplier<String> supplier = () -> new String("vedesh");
        System.out.println(supplier.get());

//        Consumer
        Consumer<String> consumer = (a) -> System.out.println(a);
        consumer.accept("vedesh");

    }
}
