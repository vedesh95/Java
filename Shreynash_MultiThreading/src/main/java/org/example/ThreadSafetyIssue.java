package org.example;

public class ThreadSafetyIssue {
    Integer a=0 ;
    public void increment(){a++;}

    public static void main(String[] args) throws InterruptedException {
        ThreadSafetyIssue threadSafetyIssue = new ThreadSafetyIssue();
        Thread t1 = new Thread(()->{
            for (int i=0;i<500;i++){
                threadSafetyIssue.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<500;i++) {
                threadSafetyIssue.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(threadSafetyIssue.a);
    }
}
