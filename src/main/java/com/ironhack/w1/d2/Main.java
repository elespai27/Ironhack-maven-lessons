package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //SHORTCOUT "psvm" "main"
        System.out.println("Week 1 day 2 lesson");

        //ARRAYS
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days);
        System.out.println(Arrays.toString(days));
        //convertimos el dato en un primitivo para mostrarlo en consola facilmente
        //llamamos a la librería java.util.Arrays;

        System.out.println(days[0]);
        System.out.println(days[1]);
        System.out.println(days[2]);
        System.out.println(days[3]);
        System.out.println(days[4]);
        System.out.println(days[5]);
        System.out.println(days[6]);

        System.out.println(days.length);//aquí actúa como propiedad
        System.out.println(days[days.length - 1]);
        //System.out.println(days[days.length]); ejemplo de array out of bounds

        String[] subjectsArray = createSubjectArray();
        System.out.println(Arrays.toString(subjectsArray));

        //LOOPS
        //for loop

        //for (int i = 0; i <= 100; i++) {
        //    System.out.println(i);
        //}

        for (int i = 0; i < subjectsArray.length; i++) {
            System.out.println(i + " : " + subjectsArray[i]);
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }


        }
        //for each
        for (String subject : subjectsArray) {
            System.out.println("subject: " + subject);
        }

        //WHILE

        int counter = 0;
        while (counter < 10) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        //DO WHILE
        counter = 100;

        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter < 110);

        //ARRAYLIST
        List<String> countries = new ArrayList<>();
        countries.add("Spain");
        countries.add("Argentina");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(0));
        System.out.println(countries.set(2, "Italy"));
        System.out.println(countries);
        System.out.println(countries.size());
        System.out.println(countries.remove(1));
        System.out.println(countries);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        //ADD ELEMENTS TO ARRAY

        int[] numbers = {0, 1, 2, 3, 4};
        //number[5] = 5; this cannot be done with array
        int[] newNumber = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            newNumber[i] = newNumber[i];
        }
        newNumber[5] = 5;

        //MATH CLASS & CASTING
        System.out.println(Math.sqrt(64));
        //CASTEO
        System.out.println(Math.pow(2, 5));
        //transformar el resultado a un número entero
        System.out.println((int) Math.pow(2, 5));
        System.out.println(3.75);
        System.out.println((int)3.75);
        //MATH CEL or FLOOR
        System.out.println(Math.ceil(3.75));
        System.out.println(Math.floor(3.75));

    }

    public static String[] createSubjectArray () {
        //Method who return a array

        String[] subjects = new String[5];
        //esta es la manera de reservar una cantidad de elementos en memoria
        //para un array de 5 elementos tip String
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }

}
