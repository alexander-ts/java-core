 package com.alexander.classwork.lesson4.loops;

public class Demo_4_Break {
	public static void main(String[] args) {

        int[] arrayOfInts =  { 32, 87, 3, 589,12, 1076, 2000,8, 622, 127 };
        
        int searchfor = 87;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}


