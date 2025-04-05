package org.example;

public class Tasks {
    public synchronized void task1(){
        try {
            System.out.println("inside task 1. sleeping for x secs");
            Thread.sleep(2000);
            System.out.println("task 1 completed");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void  task2() {
        System.out.println("inside task 2");
        synchronized (this){
            System.out.println("executing something inside task2 after acquiring lock");
        }
        System.out.println("task2 completed");
    }
    void task3(){
        System.out.println("task3 started");
        System.out.println("task3 completed");
    }
}
