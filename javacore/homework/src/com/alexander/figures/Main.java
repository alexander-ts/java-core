package com.alexander.figures;

abstract class Shape {

    public void getInfo() {
    }

    String Name;

}

class Tringle extends Shape {

    private double a;
    private double b;
    private double c;
    double p;

    public Tringle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geronSquare() {
        p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    void Result() {
        System.out.println(p);
    }
}

class Circle extends Shape {
    private double C;
    private double r;

    public Circle(double C) {
        this.C = C;
    }

    public double RadiusCounter() {
        r = C / 2 * Math.PI;
        return r;
    }

    void Result() {
        System.out.println(r);
    }
}


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Tringle T1 = new Tringle(12, 4, 6);
    }
}
