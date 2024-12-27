package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;
    public abstract void sound();
    public void play() {
        System.out.println(this.name + ", a "+ this.numberOfStrings + "-stringed instrument that goes " + this.sound);
    }

}
