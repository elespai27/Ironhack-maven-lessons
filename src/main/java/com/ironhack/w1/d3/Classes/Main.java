package com.ironhack.w1.d3.Classes;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("harryPotter", 120);
        Movie lotr = new Movie("Lord of the Rings", 300);
        Movie madMax = new Movie("Mad Max");
        System.out.println(harryPotter.getTitle() + " " + harryPotter.getDuration());
        harryPotter.setDuration(90);
        System.out.println("The new duration is: " + harryPotter.getDuration());
        System.out.println(lotr.getTitle() + " " + lotr.getDuration());
        System.out.println(harryPotter);
        System.out.println(lotr);
        System.out.println(madMax);
        System.out.println("Is it really good? " + harryPotter.IS_GOOD);
        harryPotter.play();
        lotr.play();
        madMax.play();
        Movie.displayAlert();
        HorrorMovie scream = new HorrorMovie("Scream", 80, false);
        System.out.println(scream.getTitle() + " " + scream.getDuration() + " Is it really scary? " + scream.isReallyScary());
        scream.play();//aquí el comportamiento cambia por el POLIMORFISMO

    }
}
