interface Demo{
    int var = 10; // static final by default
//    private static final int var = 10; // not allowed
//      static int var = 10; // not allowed

    void overrideMe(); // public abstract by default
    private static void methodOne(){
//        do something
    };
    private void methodTwo(){
//        do something
    };
    static void methodThree(){
        methodOne();
    };
    default void methodFour(){
//        do something
    };

    interface DemoTwo{
        void methodFive();
    }
}

class Demo3 implements Demo, Demo.DemoTwo{
    @Override
    public void overrideMe() {
//        do something
    }

    @Override
    public void methodFive() {
//        do something
    }
}

public class InterfaceDemo {

}
