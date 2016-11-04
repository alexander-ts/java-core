package com.alexander.homework.primenumbers;

class Main {

    public static void main(String[] args) {

        double s = 0;
        int a = 0;

        for (double i = 2; i <= 100; i++) {

            s = 0;

            for (double j = 0; j < Math.sqrt(i); j++ ){

               System.out.println("Iteration: " + j);
                a++;
                if ((i % j) == 0) {
                    s++;
                  //  System.out.print(j + " " );
                }
            }
            if (s <= 1) System.out.println(i);
        }
        System.out.println(a);
    }
}

