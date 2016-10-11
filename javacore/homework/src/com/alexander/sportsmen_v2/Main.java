package com.alexander.sportsmen_v2;

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
    private int step;
    private long stairs;

    Sportsmen(int step) {
        this.step = step;
    }

    public void createLad(int s, int v) {
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
    private int doStep() {
        return step;
    }
}

public class Main {
    public static void main(String[] args) {
        Sportsmen John = new Sportsmen(1);
        John.createLad(3, 1);
    }
}