package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(4,5,3);
    }

    @Override
    public void countArea() {
        System.out.println(valueSideA*valueSideB);
    }

    @Override
    public void countPerimeter() {
        System.out.println((valueSideA*2) + (valueSideB*2));
    }
}
