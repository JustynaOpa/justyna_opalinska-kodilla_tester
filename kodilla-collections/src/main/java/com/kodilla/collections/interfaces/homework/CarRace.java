package com.kodilla.collections.interfaces.homework;

import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;

public class CarRace {
    public static void main(String[] args) {
        Fiat fiat = new Fiat(65,15,10);
        doRace(fiat);

        Kia kia = new Kia(70,20,12);
        doRace(kia);

        Opel opel = new Opel(75,25,7);
        doRace(opel);
    }

    private static void doRace (Car car){


        System.out.println(car.getSpeed());

    }
}
