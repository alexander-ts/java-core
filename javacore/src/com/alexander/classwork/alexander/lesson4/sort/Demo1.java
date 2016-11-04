package com.alexander.classwork.alexander.lesson4.sort;

import java.util.Arrays;

public class Demo1 {
	
	public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print(Arrays.toString(arr) + "\n");

        for (int k = 0; k < arr.length - 1; k++) {

            int tmp = arr[k];
            
            arr[k] = arr[k + 1];
            
            arr[k + 1] = tmp;

        }

        System.out.println(Arrays.toString(arr));
        

    }

}
