package com.ironhack.w1.d4.AbstractClassInterface;

public class WebPlayer extends Player {

    public WebPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Closing WebPlayer");
    }
}
