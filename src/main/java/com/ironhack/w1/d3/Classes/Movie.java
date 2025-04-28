package com.ironhack.w1.d3.Classes;

public class Movie {
    //Una clase es una plantilla
//Propiedades que definen los objetos
//Objetos una instancia de una Clase (Ejemplo, extracto)
//Es una variable que va a tener unas propiedades y
//unos métodos particulares
//definimos las propiedades del obj tipo movie
    private String title;
    private int duration;
    //constantes
    public final boolean IS_GOOD = true;


    public Movie(String title, int duration) {
        //esto es la firma de un método
        //podemos tener varios construtores, pero no puede ser iguales
        this.title = title;
        this.duration = duration;
        //this hace referencia a la clase".Método o propiedad"

    }

    public Movie(String title) {
        this.title = title;
        this.duration = 100;
        //cuando creemos un objeto que solo tenga el tñitulo
        //usará entonces este contructor
        //esto es una sobrecarga de constructor
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

    public void play() {
        System.out.println("Now playing " + this.title);
    }
    public static void displayAlert() {
        System.out.println("It's illegal to pirate this movie");
    }
}
