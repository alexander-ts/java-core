package com.alexander.homework.consolecalculator_v2;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        Scanner textFile = new Scanner(new FileReader(args[0]));
        String line;
        while ((line = in.readLine()) != null) {
            int a = textFile.nextInt();
            String opp = textFile.next();
            int b = textFile.nextInt();
            int answer = 0;
            switch (opp){

                case "+": answer = a + b;
                break;
                case "-": answer = a - b;
                    break;
                case "*": answer = a * b;
                    break;
                case "/": answer = a / b;
                    break;
            }
             System.out.println(line + " = " + answer);
        }
    }
}
