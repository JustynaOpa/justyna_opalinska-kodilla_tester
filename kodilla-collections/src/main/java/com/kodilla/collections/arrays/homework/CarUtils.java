package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("----------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed increase: " + car.increaseSpeed());



    }
    private static String getCarName(Car car){
        if (car instanceof Fiat)
            return "Fiat";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Opel)
            return "Opel";

        return "Unknown car name";
    }
}
