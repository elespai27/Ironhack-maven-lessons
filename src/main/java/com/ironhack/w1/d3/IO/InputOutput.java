package com.ironhack.w1.d3.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        // --- INPUT POR CONSOLA ---
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Please write your name");
            name = scanner.nextLine();
        } while (name.length() <= 2);
        System.out.println("Your name is: " + name);

        do {
            scanner = new Scanner(System.in);
            System.out.println("Please write your age");
        } while (!scanner.hasNextInt());

        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        scanner.close();

        // --- FILE HANDLING ---
        String filePath = "src/com/ironhack/w1/d3/file.txt";

        FileWriter fileWriter = new FileWriter(filePath, true); // true para append
        fileWriter.write("Name: " + name + ", Age: " + age + "\n");
        fileWriter.close();

        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        String str = "";

        while (fileScanner.hasNextLine()) {
            str += fileScanner.nextLine() + "\n";
        }

        fileScanner.close();
        System.out.println(str);
    }
}
