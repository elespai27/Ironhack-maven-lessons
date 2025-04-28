package com.ironhack.w1.d4.AbstractClassInterface;

public abstract class Player {
    private double volume;
    private int currentTrack;

    public Player(double volume, int currentTrack) {
        this.volume = volume;
        this.currentTrack = currentTrack;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }

    public double getVolume() {
        return volume;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }
    public abstract void close();
}
