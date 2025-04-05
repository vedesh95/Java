package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    AtomicInteger a = new AtomicInteger();
    Integer b = 0;
    public void increment(){
        a.incrementAndGet();
        b++;
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerEx atomicIntegerEx = new AtomicIntegerEx();
        Thread t1 = new Thread(()->{
            for (int i=0;i<500;i++){
                atomicIntegerEx.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i=0;i<500;i++) {
                atomicIntegerEx.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(atomicIntegerEx.a);
        System.out.println(atomicIntegerEx.b);
    }
}
