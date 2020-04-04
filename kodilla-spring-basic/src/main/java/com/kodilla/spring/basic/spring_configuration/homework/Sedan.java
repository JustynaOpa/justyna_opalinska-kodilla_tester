package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {


    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (LocalTime.now().isAfter(LocalTime.of(19,59,59)) && LocalTime.now().isBefore(LocalTime.of(5,59,59))){
            return true;
        } else
            return false;
    }

    @Override
    public String getTypeCar() {
        return "Sedan";
    }
}
