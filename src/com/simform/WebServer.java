package com.simform;

public class WebServer extends Thread {
    public void run() {

        for (int i = 1; i <= 5; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " => Request " + i);
        }

    }
}
