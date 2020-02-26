package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;
    int increase;
    int decrease;

    public Opel(int speed, int increase, int decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;


    }
    @Override
    public int getSpeed() {
        speed = 75;
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