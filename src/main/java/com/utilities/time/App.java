package com.utilities.time;

import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        timer(1);
    }

    public static void timer(int minutes) {
        Timer temporizer = new Timer();

        temporizer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("The time is up.");
            }
        }, minutes * 60 * 1000, minutes * 60 * 1000);
    }
}
