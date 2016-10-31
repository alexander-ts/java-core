package com.alexander.collectionspeed;


import java.util.*;

class CollectionTester{
    long timer;
    int Elements;

    public void ArrayListTest(int Elements){



        ArrayList<Integer> a = new ArrayList<Integer>();

        timer = System.nanoTime();

        for (Integer i = 0 ; a.size() < Elements; i++){


            a.add(i);



        }
        long estimated = System.nanoTime() - timer;
        System.out.println("ArrayList: "+estimated);


    }

    public void LinkedListTest(int Elements){


        LinkedList<Integer> a = new LinkedList<>();

        timer = System.nanoTime();


        for (Integer i = 0 ; a.size() < Elements; i++){


            a.add(i);



        }
        long estimated = System.nanoTime() - timer;
        System.out.println("LinkedList: "+estimated);


    }

    public void HashMapTest(int Elements){



        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();

        timer = System.nanoTime();

        for (Integer i = 0 ; a.size() < Elements; i++){


            a.put(i, i);



        }
        long estimated = System.nanoTime() - timer;
        System.out.println("HashMap: " +estimated);


    }

    public void TreeMapTest(int Elements){



        TreeMap<Integer, Integer> a = new TreeMap<Integer, Integer>();

        timer = System.nanoTime();

        for (Integer i = 0 ; a.size() < Elements; i++){


            a.put(i, i);



        }
        long estimated = System.nanoTime() - timer;
        System.out.println("TreeMapTest: "+estimated);


    }

    public void LinkedHashMapTest(int Elements){



        LinkedHashMap<Integer, Integer> a = new LinkedHashMap<Integer, Integer>();

        timer = System.nanoTime();

        for (Integer i = 0 ; a.size() < Elements; i++){


            a.put(i,i);



        }
        long estimated = System.nanoTime() - timer;
        System.out.println("LinkedHashMap: "+estimated);


    }

    public void WeakHashMapTest(int Elements){



        WeakHashMap<Integer, Integer> a = new WeakHashMap<Integer, Integer>();

        timer = System.nanoTime();

        for (Integer i = 0 ; a.size() < Elements; i++){


            a.put(i,i);




        }
        long estimated = System.nanoTime() - timer;
        System.out.println("WeakHashMap: "+estimated);


    }

    public void IdentityHashMapTest(int Elements){



        IdentityHashMap<Integer,Integer> a = new IdentityHashMap<Integer, Integer>();

        timer = System.nanoTime();

        for (Integer i = 0 ; a.size() < Elements; i++){


            a.put(i,i);



        }
        long estimated = System.nanoTime() - timer;
        System.out.println("IdentitiyHashMap: "+estimated);


    }





}



 class Main {

    public static void main(String[] args) {


        CollectionTester a = new CollectionTester();

        HashSet set = new HashSet();


        a.ArrayListTest(1000);
        a.LinkedListTest(1000);
        a.HashMapTest(1000);
        a.TreeMapTest(1000);
        a.LinkedHashMapTest(1000);
        a.WeakHashMapTest(1000);
        a.IdentityHashMapTest(1000);

    }
}
