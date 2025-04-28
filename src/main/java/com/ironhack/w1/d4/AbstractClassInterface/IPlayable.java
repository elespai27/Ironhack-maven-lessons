package com.ironhack.w1.d4.AbstractClassInterface;

public interface IPlayable {
    //no podemos crear var solo const
    //y no hace falta poner final tampoco

    final double MAX_VOLUME = 1;
     void play();
     void pause(); //en las interfacez no hace falta poner public abstract
     void mute();
     void increaseVolume();


}
