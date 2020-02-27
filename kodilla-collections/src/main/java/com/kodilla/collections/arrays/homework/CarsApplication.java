package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarName = random.nextInt(3);
        double a = random.nextDouble() * 30 + 1;
        double b = random.nextDouble() * 30 + 1;
        double c = random.nextDouble() * 30 + 1;
        if (drawnCarName == 0)
            return new Fiat(a,b,c);
        else if (drawnCarName == 1)
            return new Kia(a,b,c);
        else
            return new Opel(a, b, c);
    }
}
