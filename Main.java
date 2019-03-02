package com;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        //first
        Thread_ first = new Thread_();
        first.start();
            first.join();
        //wait while first thread stop
        //sec
        Thread two = new Thread(new Runnable_());
        two.start();
            two.join();
        //wait while sec thread stop
        //three
        Callable callable = new Callable_();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread third = new Thread(futureTask);
        third.start();




    }

}
