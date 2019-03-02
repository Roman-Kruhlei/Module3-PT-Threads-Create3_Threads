package com;

public class Thread_ extends java.lang.Thread {
    public void run(){
        for(int x = 0;x<1000;x++){
            System.out.println("First: "+x);
        }
    }
}
