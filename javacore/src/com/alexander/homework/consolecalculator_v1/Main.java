package com.alexander.homework.consolecalculator_v1;


import java.io.BufferedReader;
import java.io.FileReader;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        int a,b;
        int Linenumber = 0;
        String line, sa = "", sb = "";
        String opp= " ";
        int answer = 0;
        while((line = in.readLine()) != null)
        {
            Linenumber++;
            if ( Linenumber == 1   ){sa = line;}
            if ( Linenumber == 2   ){sb = line;}
            if ( Linenumber == 3   ){opp = line;}
            System.out.println("Line: " + Linenumber);
            System.out.println(sa);
            System.out.println(sb);
            System.out.println(opp);
        }
        in.close();
        System.out.println("Your numbers: " + sa + " and " + sb + ".");
        System.out.println("Your operation: "+ opp);
        Integer ma = Integer.parseInt(sa);
        Integer mb = Integer.parseInt(sb);
        switch (opp) {
            case "+": answer = ma + mb;
            case "-": answer = ma - mb;
            case "/": answer = ma / mb;
            case "*": answer = ma * mb;
        }
        System.out.println("Answer: " + answer);
    }
}
