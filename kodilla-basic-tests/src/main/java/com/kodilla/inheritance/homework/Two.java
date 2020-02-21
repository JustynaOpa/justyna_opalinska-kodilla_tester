package com.kodilla.inheritance.homework;

public class Two extends OperatingSystem {
    public Two(int year) {
        super(year);
        System.out.println("two constructor");
    }
    public void switchOn(){
        System.out.println("Switching on");
    }
    public void turnOff(){
        System.out.println("Turning off two");
    }
}
