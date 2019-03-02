package com;

public class Runnable_ implements java.lang.Runnable {
    public void run(){
        for(int x=0;x<1000;x++){
            System.out.println("Second: "+x);
        }
    }
}
