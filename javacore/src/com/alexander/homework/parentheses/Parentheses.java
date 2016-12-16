package com.alexander.homework.parentheses;

public class Parentheses {


   static boolean one(String s){
       int counter = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '('){
                System.out.println(counter++);
            }
            else
                counter--;

        }
       if(counter < 0){
           return false;
       }
       else{
           return counter == 0;
       }

    }
    public static void main(String[] args) {


        System.out.println(one("(()("));
    }
}
