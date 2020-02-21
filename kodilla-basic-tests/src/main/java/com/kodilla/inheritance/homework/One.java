package com.kodilla.inheritance.homework;

public class One extends OperatingSystem {
    public One(int year) {
        super(year);
        System.out.println("one constructor");
    }
    public void turnOn(){
        System.out.println("Turning on one");
    }
    public void switchOff(){
        System.out.println("Turning off");
    }
}
