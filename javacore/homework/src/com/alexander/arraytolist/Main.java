package com.alexander.arraytolist;

import java.util.ArrayList;
import static com.alexander.arraytolist.Arraytolist.Arrtolist;

class Main{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Integer[] a = new Integer[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        list = Arrtolist(a) ;
        System.out.println(list.toString());
    }

}
