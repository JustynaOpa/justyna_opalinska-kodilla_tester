package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Tower", 4,3,true));
        stamps.add(new Stamp("Bridge",4,3,true));
        stamps.add(new Stamp("Easter", 4,4, false));
        stamps.add(new Stamp("Flower",4,5, false));
        stamps.add(new Stamp("Umbrella",3,6,true));
        stamps.add(new Stamp("Bridge",4,3, true));
        stamps.add(new Stamp("Flower",4,5, false));

        System.out.println(stamps.size());

        for(Stamp stamp: stamps){
            System.out.println(stamp);
        }
    }
}
