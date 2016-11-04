package com.alexander.classwork.lesson16.threads;

public class Demo2_Thread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Demo2_Thread()).start();
    }

}