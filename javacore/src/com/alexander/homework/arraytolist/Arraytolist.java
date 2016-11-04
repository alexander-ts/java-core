package com.alexander.homework.arraytolist;

import java.util.ArrayList;

/**
 * Created by Alexander on 15/03/2016.
 */
public class Arraytolist {
    public static ArrayList<Integer> Arrtolist(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
