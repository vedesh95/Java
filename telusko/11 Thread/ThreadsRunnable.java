class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("A");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("B");
        }
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class ThreadsRunnable {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();        
        t2.start();

        //Using Lambda
        Runnable c = () -> {
            for(int i=0;i<5;i++){
                System.out.println("C");
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        };

        Runnable d = () -> {
            for(int i=0;i<5;i++){
                System.out.println("D");
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        };

        Thread t3= new Thread(c);
        Thread t4= new Thread(d);
        t3.start();
        t4.start();
    }
}
