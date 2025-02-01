package org.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalComposition {
    public void run(){
        Predicate<Integer> test1 = a -> a > 5;
        Predicate<Integer> test2 = a -> a < 10;
        Predicate<Integer> test3 = test1.and(test2);
        Predicate<Integer> test4 = test1.or(test2);
        System.out.println(test3.test(5) + " " + test4.test(5));


        Function<Integer, Integer> multiply = (value) -> value * 200;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        Integer result1 = addThenMultiply.apply(3);
        System.out.println(result1);

        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
        Integer result2 = multiplyThenAdd.apply(3);
        System.out.println(result2);


    }
}
