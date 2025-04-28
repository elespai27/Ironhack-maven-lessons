package com.ironhack.w2.d1;

import java.util.List;

public class Director {
    private String name;
    private String lastName;
    private List<Movie> directedMovies;

    public Director(String name, String lastName, List<Movie> directedMovies) {
        this.name = name;
        this.lastName = lastName;
        this.directedMovies = directedMovies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Movie> getDirectedMovies() {
        return directedMovies;
    }

    public void setDirectedMovies(List<Movie> directedMovies) {
        this.directedMovies = directedMovies;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", directedMovies=" + directedMovies +
                '}';
    }
    public int getDirectedMovieSize() {
        return directedMovies.size();
    }

    public String getFullname() {
        return this.name + " " + this.lastName;
    }
}
