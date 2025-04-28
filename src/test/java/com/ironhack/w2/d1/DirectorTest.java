package com.ironhack.w2.d1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {
    //metodos especiales que se pueden ejecutar
    //para crear variables de cada test y no tener que repetir

    public static List<Movie> movieList;
    public static Director director1;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll is the first executed method");

        Movie movie1 = new Movie("A Clockwork Orange", 130);
        Movie movie2 = new Movie("The Shinning", 120);
        movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
    }
    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach is executed before each test");
        director1 = new Director("Stanley", "Kubrick", movieList);
    }
    @AfterEach
    void tearDown() {
        System.out.println("After each is executed after each test");
    }
    @Test
    void getDirectedMovieSize() {
        int directedMovieSize = director1.getDirectedMovieSize();
        System.out.println("Directed Movie Size: " + directedMovieSize);
        assertEquals(2, directedMovieSize);
    }
    @Test
    void getFullname() {
        String fullName = director1.getFullname();
        System.out.println("Full name: " + fullName);
        assertEquals("Stanley Kubrick", fullName);
    }
}