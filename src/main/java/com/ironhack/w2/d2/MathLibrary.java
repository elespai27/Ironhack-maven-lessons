package com.ironhack.w2.d2;

public class MathLibrary {

    public static int multiply(int a, int b) {
        int product = a * b;
        if (product / a != b) {
            throw new IllegalArgumentException("The Product input is out of the value");
        }
        return product;
    }

}
