package org.example.stampedlock;

import java.util.concurrent.locks.StampedLock;

public class LockStampedRW {
    int a;
    public void increment1(StampedLock lock) throws InterruptedException {
        long stamp = lock.writeLock();
        a+=1;
        Thread.sleep(2000);
        System.out.println("increment1 by:" + Thread.currentThread().getName() + " a=" + a);
        lock.unlock(stamp);
    }
    public void increment2(StampedLock lock) throws InterruptedException {
        long stamp = lock.writeLock();
        a+=2;
        Thread.sleep(2000);
        System.out.println("increment2 by:" + Thread.currentThread().getName()+ " a=" + a);
        lock.unlock(stamp);
    }
    public void read(StampedLock lock) throws InterruptedException {
        long stamp = lock.readLock();
        Thread.sleep(6000);
        if(lock.validate(stamp)){
            System.out.println("rollback...");
        }else{
            System.out.println(" read by:" + Thread.currentThread().getName()+  " a=" + a);
        }
        lock.unlock(stamp);
    }
}
