package com.alexander.homework.deletefromlinkedlist;

import java.util.*;






public class Main {


    public static void removemid ( LinkedList<Integer> list){

            int size = list.size() / 2;
            list.remove(size);



    }


    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        removemid(list);
        removemid(list);


        System.out.println(list.toString());












    }

}