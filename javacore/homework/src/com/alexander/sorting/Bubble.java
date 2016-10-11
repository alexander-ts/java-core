package com.alexander.sorting;

public class Bubble {


    public static void main(String[] args) {

        int[] nums = {1 ,3, 4 , 5, 6, 2 ,7, 0, 21, 10};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
        for (int a = 1; a < nums.length; a++) {

            for (int b = nums.length  - 1, t ; b >= a ; b--) {

                if (nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }

            }
        }
        for (int i = 0; i < nums.length ; i++) {

            System.out.print(nums[i] + " ");
        }
    }
}
