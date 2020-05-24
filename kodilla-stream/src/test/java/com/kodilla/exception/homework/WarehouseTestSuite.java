package com.kodilla.exception.homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test (expected = OrderDoesntExistException.class)
    public void testGetOrder() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order result = warehouse.getOrder("A20");
        //then
        assertEquals(null, result);
    }
    @Test
    public void testGetOrderList(){
        Warehouse warehouse = new Warehouse();
        List<Order> list = warehouse.getOrderList();
        Assert.assertEquals(warehouse.orders,list);
    }
}