package com.alexander.homework.numberinlinkedlist;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i = 0; list.size() < 100; i++) {
            int min = 1;
            int max = 100;
            list.add(rand.nextInt(max) + 1);
            System.out.println("index " + i + " = " + list.get(i));

        }
        System.out.println(list.toString());
        Integer lookfor = 11;
        for (Integer i : list)
            if (i == lookfor) {
                System.out.println("Contain this element under index: " + list.indexOf(i));
            }
    }
}

