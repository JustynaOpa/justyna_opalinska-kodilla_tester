package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.countArea();
        triangle.countPerimeter();

        Quadrate quadrate = new Quadrate();
        quadrate.countArea();
        quadrate.countPerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.countArea();
        rectangle.countPerimeter();

    }
}
