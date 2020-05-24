package com.kodilla.exception.homework;

import org.junit.Assert;
import org.junit.Test;

public class OrderTestSuite {

    @Test
    public void testGetNumber(){
        Order order = new Order("A102");
        String result = order.getNumber();
        Assert.assertEquals("A102", result);

    }
}
