package com.ironhack.w2.d1;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Movie movie1 = new Movie("The Clockwork Orange", 130);
        Movie movie2 = new Movie("The Shinning", 120);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        Director director1 = new Director("Stanley", "Kubrick", movieList);
        System.out.println(director1);
        System.out.println(director1.getDirectedMovieSize());
        System.out.println(director1.getFullname());
    }

}