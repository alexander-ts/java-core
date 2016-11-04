package com.alexander.homework.exerscise13;

import java.util.LinkedList;


class Number {

    private boolean directorder = true;

    public void setDirectorder(boolean directorder) {
        this.directorder = directorder;
    }

    private Integer a;
    private Integer b;
    private Integer c;

    private LinkedList<Integer> numb1 = new LinkedList<Integer>();
    private LinkedList<Integer> numb2 = new LinkedList<Integer>();
    private LinkedList<Integer> answer = new LinkedList<Integer>();
    private LinkedList<Integer> answer2 = new LinkedList<Integer>();

    public void Number1(Integer a, Integer b, Integer c) {

        this.a = a;
        this.b = b;
        this.c = c;

        if (directorder == false) {
            System.out.println();
            numb1.addLast(this.a);
            numb1.addLast(this.b);
            numb1.addLast(this.c);
            System.out.println(numb1.toString());
        } else {

            numb1.addFirst(this.a);
            numb1.addFirst(this.b);
            numb1.addFirst(this.c);
            System.out.println(numb1.toString());
        }
    }

    public void Number2(Integer a, Integer b, Integer c) {

        this.a = a;
        this.b = b;
        this.c = c;

        if (directorder == false) {
            numb2.addLast(this.a);
            numb2.addLast(this.b);
            numb2.addLast(this.c);
            System.out.println(numb2.toString());
        } else {

            numb2.addFirst(this.a);
            numb2.addFirst(this.b);
            numb2.addFirst(this.c);
            System.out.println(numb2.toString());
        }
    }


    public void plus() {

        Integer ans = 0;


        for (Integer i = 0; i < numb1.size() && i < numb2.size(); i++) {

            if (i == 0) {
                numb1.set(i + 1, numb1.get(i + 1) * 10);
                numb1.set(i + 2, numb1.get(i + 2) * 100);
                numb2.set(i + 1, numb2.get(i + 1) * 10);
                numb2.set(i + 2, numb2.get(i + 2) * 100);
            }

            ans += numb1.get(i) + numb2.get(i);


        }

        String str = Integer.toString(ans);

        String[] parts;

        parts = str.split("(?!^)");

        for (int i = 0; i < parts.length; i++) {

            answer.addFirst(Integer.parseInt(parts[i]));

        }

        for (int i = 0; i < parts.length; i++) {

            answer2.addLast(Integer.parseInt(parts[i]));

        }

        System.out.println("Indirect order answer: " + answer.toString());
        System.out.println("Direct order answer: " + answer2.toString());

    }
}

public class Main {

    public static void main(String[] args) {

        Number a = new Number();
        a.setDirectorder(true);
        a.Number1(1, 2, 2);
        a.Number2(2, 3, 0);
        a.plus();

    }
}
