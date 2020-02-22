package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle() {
        super(3,5,5);
    }

    @Override
    public void countArea() {
        System.out.println((valueSideA/2) * valueSideB);
    }

    @Override
    public void countPerimeter() {
        System.out.println(valueSideA * 3);

    }
}
