import java.util.ArrayList;
import java.util.List;

class SingleEntryCache<K, V> {
    K key;
    V value;
    V getValue(){return value;}
    void setValue(V value){this.value=value;}
}

class GenericCache<K,V> extends SingleEntryCache<K,V> { }

class ParticularCache extends SingleEntryCache<Long, Double> { }

class GenericMethod{
    public <T> void add(T v1,  T v2){}
}

class MaxInteger <T extends Number>{ }

interface A { }
interface B { }

class D<T> {}
class E<T> extends D implements A, B {}
class F<T extends E & A & B> { }

class WildCardDemo{
    public <T extends Number> void addByGenerics(List<T> list1, List<T> list2) {}
    public void addByWildCard(List<? extends Number>list1, List<? extends Number>  list2) {}
}

public class GenericClassDemo {
    public static void main(String[] args) {
        SingleEntryCache<Integer, Long> cache = new SingleEntryCache<>();
        cache.setValue(2L);
        System.out.println(cache.getValue());

        GenericCache<String, Character> colorPrint = new GenericCache<>();
        ParticularCache blackNWhite = new ParticularCache();
        GenericMethod genericMethod = new GenericMethod();

        MaxInteger<Integer> maxInteger = new MaxInteger<>();

        F<E> f = new F<>();

        WildCardDemo wildCardDemo = new WildCardDemo();
        List<Integer> list1 = new ArrayList<>();
        List<Float> list2 = new ArrayList<>();
//        doesn't work. both types have to be same
//        wildCardDemo.addByGenerics(list1, list2);
        wildCardDemo.addByWildCard(list1, list2);

    }
}
