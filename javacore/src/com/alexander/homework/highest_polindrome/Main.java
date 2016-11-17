package com.alexander.homework.highest_polindrome;

public class Main {

    static int reverseInt(int number) {
        int result = 0;
        while (number != 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int max = 0;
        int iterations = 0;
        for (int i = 999; i > 100 && i * 999 > max; i--) {
            for (int j = 999; j > i; j--) {
                iterations++;
                if(j*i == reverseInt(j*i)){
                    if(i*j > max){
                        max = j * i;
                        break;
                    }else{
                        break;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
