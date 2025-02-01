class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("A");
            try{
                Thread.sleep(2);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("B");
        }
        try{
            Thread.sleep(2);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class ThreadsDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.setPriority(5);

        a.start();        
        b.start();

        /*
            Threads:
            Multiple tasks. each task has multiple Threads. Threads can share resoources. Thread is a smallest unit of work
            setPriority() 1 to 10
            sleep() 
        */
   }
}
