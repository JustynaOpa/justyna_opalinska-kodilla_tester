package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {
    private double speed;
    double increase;
    double decrease;

    public Fiat(double speed, double increase, double decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }


    public double getSpeed() {

        speed = speed + (increase * 3) - (decrease * 2);

        return speed;

    }
    @Override
    public double increaseSpeed() {
        return increase;
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(decrease);
    }
}
