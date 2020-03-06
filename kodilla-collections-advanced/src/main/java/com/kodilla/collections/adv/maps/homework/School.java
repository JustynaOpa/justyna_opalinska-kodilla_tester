package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> studentsNumber = new ArrayList<>();

    public School(double... studentsNumber){
        for(double number : studentsNumber)
            this.studentsNumber.add(number);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsNumber=" + studentsNumber +
                '}';
    }
    public double getSummary(){
        double suma = 0.0;
        for(double number : studentsNumber)
            suma += number;
        return suma;

    }


}
