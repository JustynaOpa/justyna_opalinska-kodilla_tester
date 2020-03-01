package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Fiat;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Fiat> cars = new ArrayList<>();
        Fiat car1 = new Fiat(55,7,5);
        cars.add(car1);
        cars.add(new Fiat(72,12,6));
        cars.add(new Fiat(64,8,3));
        cars.add(new Fiat(95,25,15));

        cars.remove(2);
        cars.remove(car1);
        System.out.println(cars.size());

        for(Fiat fiat : cars) {
            CarUtils.describeCar(fiat);
        }


    }
}
