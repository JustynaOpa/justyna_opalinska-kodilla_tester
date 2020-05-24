package com.kodilla.collections.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class ShapeTestSuite {

    Circle circle = new Circle(12);
    Triangle triangle = new Triangle(5, 4, 3);
    Square square = new Square(10);

    @Test
    public void shouldReturnValueOfArea(){
        double circleArea = circle.getArea();
        double triangleArea = triangle.getArea();
        double squareArea = square.getArea();

        Assert.assertEquals(452.39, circleArea, 0.01);
        Assert.assertEquals(10.00, triangleArea, 0.01);
        Assert.assertEquals(100.00, squareArea, 0.01);
    }
    @Test
    public void shouldReturnValueOfPerimeter(){
        double cP = circle.getPerimeter();
        double tP = triangle.getPerimeter();
        double sP = square.getPerimeter();

        Assert.assertEquals(75.40, cP, 0.01);
        Assert.assertEquals(12.00, tP, 0.01);
        Assert.assertEquals(40.00, sP, 0.01);
    }
}
