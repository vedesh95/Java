package org.example;

public class SharedResource {
    boolean isItemAvailable;

    public synchronized void addItem(){
        System.out.println(Thread.currentThread().getName() + " trying to add item now");
        while(isItemAvailable){
            try {
                System.out.println(Thread.currentThread().getName() + " waiting to add item");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isItemAvailable = true;
        System.out.println(Thread.currentThread().getName() + " added item");
        notifyAll();
    }
    public synchronized void consumeItem() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " trying to consume item");
        while(!isItemAvailable){
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " waiting to consume item");
            wait(); //comment this and deadlock / race condition will happen
        }
        isItemAvailable = false;
        System.out.println(Thread.currentThread().getName() + " consumed item");
    }
}
