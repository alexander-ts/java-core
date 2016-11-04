package com.alexander.homework.sportsmen_v1;

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
    private int step;
    private int stairs;

    Sportsmen(int step) {
        this.step = step;
    }

    public void createLad(int stairs) {

        Ladder Lad = new Ladder(this.stairs = stairs);
        int[] S = new int[100];
        int counter = 0;
        S[0] = this.doStep();
        S[1] = 1 + S[0];
        S[2] = 1 + S[0] + S[1];

        if (Lad.getStairs() == 3) {
            System.out.println(4);
        } else if (Lad.getStairs() == 2) {
            System.out.println(2);
        } else if (Lad.getStairs() == 1) {
            System.out.println(1);
        } else {
            for (int I = 3; I < Lad.getStairs(); I++) {
                S[I] = S[I - 1] + S[I - 2] + S[I - 3];
                counter = S[I];
            }
            System.out.println(counter);
        }
    }
    private int doStep() {
        return step;
    }
}

public class Main {
    public static void main(String[] args) {
        Sportsmen John = new Sportsmen(1);
        John.createLad(10);
    }
}