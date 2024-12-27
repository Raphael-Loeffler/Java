package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
    public Violin() {
        this.numberOfStrings = 4;
        this.sound = "Screech";
        this.name = "Violin";
    }
    public void sound() {
        System.out.println(this.sound);
    }
    public Violin(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        this.sound = "Screech";
        this.name = "Violin";
    }
}
