package org.example;

import org.example.stampedlock.LockStamped;
import org.example.stampedlock.LockStampedRW;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Tasks tasks = new Tasks();
//        Thread t1 = new Thread(() -> tasks.task1());
//        Thread t2 = new Thread(() -> tasks.task2());
//        Thread t3 = new Thread(() -> tasks.task3());
//        t1.start();
//        t2.start();
//        t3.start();
//
//        MultiThread t4 = new MultiThread(tasks);
//        t4.run();

//        SharedResource sharedResource = new SharedResource();
//        Thread t1  = new Thread(() -> {
//            sharedResource.addItem();
//        });
//        Thread t2  = new Thread(() -> {
//            try {
//                sharedResource.consumeItem();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        t1.start();
//        t2.start();

//        ReentrantLock reentrantLock = new ReentrantLock();
//        read write lock
//        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
//        RWLock rwLock = new RWLock();
//        Thread t1 = new Thread(() -> {
//            try {
//                rwLock.consume(readWriteLock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            try {
//                rwLock.consume(readWriteLock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread t3 = new Thread(() -> {
//            try {
//                rwLock.produce(readWriteLock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread t4 = new Thread(() -> {
//            try {
//                rwLock.produce(readWriteLock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

//        LockStamped lockStamped = new LockStamped();
//        StampedLock lock = new StampedLock();
//        Thread t1=new Thread(() -> {
//            lockStamped.increment1(lock);
//        });
//        Thread t2=new Thread(() -> {
//            lockStamped.increment2(lock);
//        });
//        Thread t3=new Thread(() -> {
//            try {
//                lockStamped.read(lock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        Thread t4=new Thread(() -> {
//            try {
//                lockStamped.read(lock);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        LockStampedRW lockStamped = new LockStampedRW();
        StampedLock lock = new StampedLock();
        Thread t1=new Thread(() -> {
            try {
                lockStamped.increment1(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2=new Thread(() -> {
            try {
                lockStamped.increment2(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t3=new Thread(() -> {
            try {
                lockStamped.read(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t4=new Thread(() -> {
            try {
                lockStamped.read(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}