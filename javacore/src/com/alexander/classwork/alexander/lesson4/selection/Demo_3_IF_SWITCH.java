package com.alexander.classwork.alexander.lesson4.selection;

public class Demo_3_IF_SWITCH {

    public static void main(String[] args) {
    	//System.out.println(ifMethodInt(1));
    	System.out.println(ifMethodInt(3));

    }

    public static int ifMethodInt(int intOne) {
        if (intOne == 1) {
            return 1;
           
        } else if (intOne == 2) {
            return 2;
        }
        System.out.println("test");
        return 3;
    }

    public static int switchMethodInt(int intOne) {
        switch (intOne) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }
}
