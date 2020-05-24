package com.kodilla.collections.interfaces.homework;

import org.junit.Assert;
import org.junit.Test;

public class CarTestSuite {

    Fiat fiat = new Fiat(50,10,5);
    Kia kia = new Kia(60,15,4);
    Opel opel = new Opel(70,12,10);

    @Test
    public void shouldReturnActualSpeed(){
        double fs = fiat.getSpeed();
        double ks = kia.getSpeed();
        double os = opel.getSpeed();

        Assert.assertEquals(70, fs, 0.01);
        Assert.assertEquals(97, ks, 0.01);
        Assert.assertEquals(86, os, 0.01);

    }
    @Test
    public void shouldReturnValueOfIncrease(){
        double fi = fiat.increaseSpeed();
        double ki = kia.increaseSpeed();
        double oi = opel.increaseSpeed();

        Assert.assertEquals(10, fi, 0.01);
        Assert.assertEquals(15, ki, 0.01);
        Assert.assertEquals(12, oi, 0.01);

    }
    @Test
    public void shouldReturnValueOfDecrease(){
        double fd = fiat.decreaseSpeed();
        double kd = kia.decreaseSpeed();
        double od = opel.decreaseSpeed();

        Assert.assertEquals(5, fd, 0.01);
        Assert.assertEquals(4, kd, 0.01);
        Assert.assertEquals(10, od, 0.01);

    }
}
