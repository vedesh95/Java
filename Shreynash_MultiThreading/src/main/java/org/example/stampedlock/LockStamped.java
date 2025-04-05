package org.example.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class LockStamped {
    int a;
    public void increment1(StampedLock lock){
        long stamp = lock.writeLock();
        a+=1;
        System.out.println("increment1 called by:" + Thread.currentThread().getName() + " a=" + a);
        lock.unlock(stamp);
    }
    public void increment2(StampedLock lock){
        long stamp = lock.writeLock();
        a+=2;
        System.out.println("increment2 called by:" + Thread.currentThread().getName()+ " a=" + a);
        lock.unlock(stamp);
    }
    public void read(StampedLock lock) throws InterruptedException {
        long stamp = lock.tryOptimisticRead();
        System.out.println(" read called by:" + Thread.currentThread().getName()+  " a=" + a);
        Thread.sleep(3000);
        if(!lock.validate(stamp)){
            System.out.println("rollback... by:"+ Thread.currentThread().getName());
        }
    }
}
