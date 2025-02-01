class E {
    public void demo() throws ClassNotFoundException{
        Class.forName("throws demo: SomeClass");
    }
}

public class ExceptionDemo2 {
    public static void main(String[] args) {
        E e = new E();
        try{
            e.demo();
        }catch(Exception ex){
            System.out.println(ex);
            System.out.println("Printing Stack Trace now");
            ex.printStackTrace();
        }
    }
}
