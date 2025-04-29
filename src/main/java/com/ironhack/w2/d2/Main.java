package com.ironhack.w2.d2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //CHECKED EXCEPTIONS
        readFile("myFile.txt");

        // UNCHECKED EXCEPTIONS
        String name = "Vero";
        printLength(name);

        //throws (esto lanza un excepcion desde fuera del metodo)
        int[] sampleArray = null;
        try {
            printArray(sampleArray);
        } catch (NullPointerException e) {
            System.out.println("The array cannot be null");
        }

        //THROWING EXCEPTIONS
        int a = 900000000;
        int b = 400000000;
        try {
            int product = multiply(a, b);
            System.out.println(product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Using the long version...");
            long longProduct = multiply((long) a, (long) b);
            System.out.println(longProduct);
        }

        //EQUALS, HASH, & TO STRING
        Book book1 = new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
        Book book2 = new Book(1234, "Harry Potter", "J.K. Rowling", 1997);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println("book1 is equals a book2: " + book1.equals(book2));
    }

    public static void readFile(String fileName) {

        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        }

    }

    public static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("The String cannot be null");
        }
    }

    public static void printArray(int[] numArray) throws NullPointerException {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

    public static int multiply(int a, int b) {
        int product = a * b;
        if (product / a != b) {
            throw new IllegalArgumentException("The Product input is out of the value");
        }
        return product;
    }

    public static long multiply(long a, long b) {
      return a * b;

    }
}

