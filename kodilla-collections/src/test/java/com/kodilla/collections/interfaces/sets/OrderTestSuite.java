package com.kodilla.collections.interfaces.sets;

import com.kodilla.collections.sets.Order;
import org.junit.Assert;
import org.junit.Test;

public class OrderTestSuite {

    Order order = new Order("A5246","Barbie",55.00);
    @Test
    public void shouldReturnOrderNumberAndName(){
        String number = order.getOrderNumber();
        String name = order.getProductName();
        Assert.assertEquals("A5246", number);
        Assert.assertEquals("Barbie", name);
    }
    @Test
    public void shouldReturnQuantity(){
        double quantity = order.getQuantity();
        Assert.assertEquals(55, quantity, 0.01);
    }
    @Test
    public void shouldReturnAll(){
        int result = order.hashCode();
        Assert.assertEquals("Barbie", 55.00, 0.01, result);
    }
}
