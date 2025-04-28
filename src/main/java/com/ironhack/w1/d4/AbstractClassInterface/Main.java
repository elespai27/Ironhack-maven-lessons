package com.ironhack.w1.d4.AbstractClassInterface;

public class Main {
    public static void main(String[] args) {

        //ABSTRACT CLASSES & INTERFACES
        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);
        System.out.println("Web Player volume: " + webPlayer.getVolume());
        webPlayer.close();
        applePlayer.close();
        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());

        AndroidPlayer androidPlayer = new AndroidPlayer(0.7, 5);
        androidPlayer.play();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        androidPlayer.increaseVolume();
        System.out.println(androidPlayer.getVolume());
        System.out.println(androidPlayer.share());

    }
}
