package com.kodilla.abstracts.homework;

public class Quadrate extends Shape{
    public Quadrate() {
        super(4,5,5);
    }

    @Override
    public void countArea() {
        System.out.println(valueSideA*valueSideA);

    }

    @Override
    public void countPerimeter() {
        System.out.println(valueSideA*4);

    }
}
