package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {
    private int speed;
    int increase;
    int decrease;

    public Kia(int speed, int increase, int decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;

    }

    @Override
    public int getSpeed() {
        speed = 70;
        speed = speed + (increase * 3) - (decrease * 2);
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(increase);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(decrease);
    }
}