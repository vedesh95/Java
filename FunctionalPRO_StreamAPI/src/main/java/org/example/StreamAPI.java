package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public void run(){
        List<String> list = new ArrayList<String>();

        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");

        Stream<String> stream = list.stream();

        System.out.println("\n**filter");
        stream.map(x -> x.toLowerCase()).filter(x -> x.length()<=3).forEach(x-> System.out.println(x));

        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");

        System.out.println("\n**flatMap");
        stream = list.stream();
        stream.flatMap(x -> {String split [] = x.split(" "); return (Stream<String>) Arrays.asList(split).stream();}).forEach(x-> System.out.println(x));
//        Note that this example finishes with a call to forEach() which is a terminal operation. This call is only there to trigger the internal iteration, and thus flat map operation. If no terminal operation was called on the Stream chain, nothing would have happened. No flat mapping would actually have taken place.

        System.out.println("\n**distinct");
        stream = list.stream();
        stream.distinct().forEach(s -> System.out.println(s));

        System.out.println("\n**limit");
        list.stream().limit(2).forEach(s-> System.out.println(s));

        System.out.println("\n**map & peak");
        list.stream().limit(2).peek(s-> System.out.println(s)).map(s->s.toLowerCase()).forEach(s-> System.out.println(s));
        //output
//        ONE
//        one
//        TWO
//        two
//        peak is non terminal op

        System.out.println("\n**anyMatch all none");
        System.out.println(list.stream().anyMatch(x-> x.startsWith("ONE")));
        System.out.println(list.stream().allMatch(x-> x.startsWith("ONE")));
        System.out.println(list.stream().noneMatch(x-> x.startsWith("ONE")));

        System.out.println("\n**collect()");
        System.out.println(list.stream().map(x->x.toLowerCase()).collect(Collectors.toSet()));

        System.out.println("\n**count()");
        System.out.println(list.stream().map(x->x.toLowerCase()).count());

        System.out.println("\n**findAny() findFirst()"); //returns opt
        System.out.println(list.stream().findAny());
        System.out.println(list.stream().findFirst());

        System.out.println("\n**min() max()");
        System.out.println((list.stream().min((a,b) -> a.compareTo(b))));
        System.out.println((list.stream().max((a,b) -> a.compareTo(b))));

        System.out.println("\n**sorted()");
        System.out.println(list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList()));

        System.out.println("\n**reduce()");
        System.out.println(list.stream().reduce((a,b) -> a+b));

        System.out.println("\n**toArray()");
        System.out.println(list.stream().toArray());

        System.out.println("\n**concat()");
        Stream.concat(list.stream(),list.stream()).distinct().forEach(s-> System.out.println(s));

        System.out.println("\n**Create Stream From Array");
        System.out.println(Stream.of("one", "two", "three").distinct().findFirst());
    }
}
