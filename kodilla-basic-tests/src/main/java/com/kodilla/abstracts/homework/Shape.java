package com.kodilla.abstracts.homework;

public abstract class Shape {
    int numberOfSides;
    int valueSideA;
    int valueSideB;

    public Shape(int numberOfSides, int valueSideA, int valueSideB){
        this.numberOfSides = numberOfSides;
        this.valueSideA = valueSideA;
        this.valueSideB = valueSideB;

    }
    public abstract void countArea();

    public abstract void countPerimeter();


}
