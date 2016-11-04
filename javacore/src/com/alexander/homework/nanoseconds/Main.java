package com.alexander.homework.nanoseconds;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        long starttime = System.nanoTime();
        long starttime2 = System.nanoTime();
        ArrayList<Integer> a = new ArrayList<Integer> ();
        System.out.println( a);
        double mseconds = ((double) starttime) / 1000000000.0;
        double seconds = (mseconds % 3600) % 60;
        System.out.println(starttime);
        System.out.println(mseconds);
        System.out.println((mseconds / 1000) % 60 );
    }
}
