package com.alexander.homework.classwithanytype;

import java.util.Arrays;

class Any<T> {

    Object[] arr;
    T Type;

    public void takeit() {
        System.out.println(Arrays.toString(arr));
    }

    Any(T Type) {

        this.Type = Type;

    }

    public int[] getTypeInt() {
        int[] s = ((int[]) Type);
        return s;
    }

    public short[] getTypeShort() {
        short[] s = ((short[]) Type);
        return s;
    }

    public long[] getTypeLong() {
        long[] s = ((long[]) Type);
        return s;
    }

    public String[] getTypeString() {
        String[] s = ((String[]) Type);
        return s;
    }

    public char[] getTypeChar() {
        char[] s = ((char[]) Type);
        return s;
    }

    public float[] getTypeFloat() {
        float[] s = ((float[]) Type);
        return s;
    }

    public double[] getTypeDouble() {
        double[] s = ((double[]) Type);
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Any <int[]> array = new Any <int[]> ( new int[23] );
    }
}
