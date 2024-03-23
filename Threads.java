class Three extends Thread{
    public static int amount=0;
    public static void main(){
        Three t = new Three();
        t.start();
        while(t.isAlive()){
            System.out.println("Waiting...");
        }
        amount++;
        System.out.println("Main: "+amount);
        amount++;
        System.out.println("Main: "+amount);
    }
    public void run(){
        amount++;
        System.out.println("class Three This is running in thread");
    }
}

class Four implements Runnable{
    public static int amount=0;
    public static void main(){
        Four f = new Four();
        Thread thread = new Thread(f);
        thread.start();
        amount++;
        System.out.println("class Four Main: "+amount);
        amount++;
        System.out.println("class Four Main: "+amount);
    }
    public void run(){
        amount++;
        System.out.println("class Four This is running in thread. "+"amount is "+amount);
    }
}

public class Threads {
    public void demo(){
        System.out.println("Threads Demo");
        
        //creating thread
        //two ways to create thread
        //extending the Thread class and overriding its run() method
        // implement the Runnable interface
    
        Three thr = new Three();
        thr.main();

        Four f = new Four();
        f.main();
    }
}
