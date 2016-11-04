package com.alexander.sportsmen_v;

import java.math.BigInteger;

//author Alexander T.

class Ladder {

    private int Stairs;

    Ladder(int Stairs) {
        this.Stairs = Stairs;
    }

    public int getStairs() {
        return Stairs;
    }
}

class Sportsmen {
    int s;
    int v;


    public void stepsLad(int s, int v) {
        this.s = s;
        this.v = v;
        BigInteger[] a = new BigInteger[s + 1];
        a[0] = BigInteger.ONE;
        int start;
        for (int i = 1; i <= s; i++) {
            start = Math.max(0, i - v);
            a[i] = BigInteger.ZERO;
            for (int j = start; j < i; j++) {
                a[i] = a[i].add(a[j]);
            }
        }
        System.out.println(a[s]);
    }

}

public class Main {
    public static void main(String[] args) {
        Sportsmen John = new Sportsmen();
        John.stepsLad(100, 3);
    }
}