package com;

public class Callable_ implements java.util.concurrent.Callable {
    public String call() {
        for(int x=0;x<1000;x++){
            System.out.println("Third: "+x);
        }
        return Thread_.currentThread().getName();

    }
}
