package org.example;

public class MultiThread implements Runnable{
    private Tasks tasks;
    MultiThread(Tasks tasks){
        this.tasks=tasks;
    }
    @Override
    public void run() {
        tasks.task3();
    }
}
