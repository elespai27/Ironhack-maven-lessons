package com.ironhack.w1.d1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word!");

        // PRIMITIVE DATA TYPES
        byte myByte = 127; //-128 to 127
        short myShort = 1000; //-32,768 to 32,767
        int myInt = 9999; //-2,147,483,648 to 2,147,483,647
        long myLong = 50000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myFloat = 1.2345f; // Sufficient for storing 6 to 7 decimal digits
        double myDouble = 3.2546; //Sufficient for storing 15 decimal digits
        boolean myBoolean = true; //Stores true or false values
        char myChar = 'a'; //Stores a single character/letter or ASCII values

        System.out.println("my Byte: " + myByte);
        System.out.println("my Short: " + myShort);
        System.out.println("my Int: " + myInt);
        System.out.println("my Long: " + myLong);
        System.out.println("my Float: " + myFloat);
        System.out.println("my Double: " + myDouble);
        System.out.println("mmyBoolean: " + myBoolean);
        System.out.println("mmyChar: " + myChar);

        //cambiar var

        myInt = 12345;
        System.out.println("my Int: " + myInt);

        //STRING, en Java no es var primitiva
        //las var primitiva van en minúsculas
        //las no primitivas comienzan en mayúsculas
        //String

        String myString = "Hello everyone!";
        System.out.println("my String: " + myString);
        //los string tienen métodos que se activan con un punto después de la var

        // OPERATORS

        int number = 10;
        double doubleNumber = 10;
        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);

        // CONDITIONALS
        // if-else syntax
        number = 5;

        if (number == 0) {
            System.out.println("Number is equal to 0");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("Number is equal or bigger than 100 and less o equal tha 1000");
        } else {
            System.out.println("Number has another value");
        }
        if (number >= 10 || number <= -10) {
            System.out.println("Number has at least 2 digits");
        }

        if (number % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        boolean myCondition = false;
        if (myCondition) System.out.println("Condition is true");
        if (!myCondition) System.out.println("Condition is false");

        // SWITCH CASE

        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }
    // Calling Methods
        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(10);
        System.out.println(info);

        //STRING METHODS

        String address = "Fake Street, 123";
        System.out.println("Address: " + address);
        System.out.println("Address length: " + address.length());
        //en JS es una propiedad en JAVA es un método con ()
        System.out.println(address.toUpperCase());
        //concatenar metdoso de los strings
        System.out.println(address.toUpperCase().replace("E", "@"));

        //comparación de datos no Primitivos con equals

        String address2 = "Fake Street, 5";
        if (address.equals(address2)) System.out.println("They are the same address");
        else System.out.println("They are different addresses");

        //WRAPPERS (envoltorios)
        //crea un objeto que actua como una var primitiva
        //ver como se escriben los Wrapper Class en w3schools

        Integer myNum = 100; //ocupan más espacio que las var primitivas, se usan solo si hacen falta
        System.out.println(myNum); //si ponemos puntos, aparecen metodos

    }

    //METHODS (FUNCTION)
    public static void myMethod() {
        System.out.println("This");
        System.out.println("Is");
        System.out.println("Inside");
        System.out.println("My");
        System.out.println("Method");
    }

    public static String getInfo (int option) {
        if (option == 1) return "My name is Verónica";
        else if (option == 2) return "This is Java Bootcamp";
        else return "option " + option + " provides no info";
    }

}



