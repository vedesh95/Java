package org.example.threadpoolexecutor;

import java.util.concurrent.*;

class CustomThreadFactory implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(false);
        t.setPriority(Thread.NORM_PRIORITY);
        return t;
    }
}

class CustomRejectHandler implements RejectedExecutionHandler{
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("demo of reject handler");
    }
}

public class ThreadPoolExecutorEx {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 45, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());
        ThreadPoolExecutor threadPoolExec = new ThreadPoolExecutor(2, 4, 45, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectHandler());

        for(int i=0;i<7;i++){
            threadPoolExec.submit(()->{
                try {
                    System.out.println("tasked executed by:" + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        threadPoolExec.shutdown();

    }
}
