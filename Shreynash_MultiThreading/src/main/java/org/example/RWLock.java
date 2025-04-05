package org.example;

import java.util.concurrent.locks.ReadWriteLock;

public class RWLock {

    public void consume(ReadWriteLock lock) throws InterruptedException {
        lock.readLock().lock();
        System.out.println("read lock acquired by:" + Thread.currentThread().getName());
        Thread.sleep(2000);
        lock.readLock().unlock();
    }
    public void produce(ReadWriteLock lock) throws InterruptedException {
        lock.writeLock().lock();
        System.out.println("write lock acquired by:" + Thread.currentThread().getName());
        Thread.sleep(2000);
        lock.writeLock().unlock();
    }

}
