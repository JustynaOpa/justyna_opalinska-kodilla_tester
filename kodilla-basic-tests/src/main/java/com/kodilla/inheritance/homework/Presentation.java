package com.kodilla.inheritance.homework;

public class Presentation {
    public static void main(String[] args){
        One one = new One(2008);
        one.turnOn();
        Two two = new Two(2010);

        OperatingSystem operatingSystem = new OperatingSystem(2015);
        System.out.println(operatingSystem.getYear());

    }
}
