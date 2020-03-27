package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    LocalDate d1 = LocalDate.of(2020,02,14);
    LocalDate d2 = LocalDate.of(2020,02,19);
    LocalDate d3 = LocalDate.of(2020,02,28);

    Order order1 = new Order("Don28",125.14, d1);
    Order order2 = new Order("Evan55",25.84, d2);
    Order order3 = new Order("Anna21",73.15, d3);

    @BeforeEach
    public void before(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrderToList() {
        //given
        LocalDate d4 = LocalDate.of(2020,01,28);
        Order order4 = new Order("Mami12",12.5, d4);
        shop.addOrder(order4);
        //when
        int sizeOfOrders = shop.getSize();
        //then
        assertEquals(4, sizeOfOrders);
    }
//    @Test
//    public void shouldGetListOfOrdersFromDefinedDate(){
//        //when
//        LocalDate date = shop.getOrderDate();
//        //then
//        assertEquals(1, date);
//
//    }
    @Test
    public void shouldGetOrderWithTheMaxValue(){
        //when
        double max = shop.getMaxValueOfOrder();
        //then
        assertEquals(125.14, max);

    }
    @Test
    public void shouldGetOrderWithTheMinValue(){
        //when
        double min = shop.getMinValueOfOrder();
        //then
        assertEquals(25.84, min);

    }
    @Test
    public void shouldGetSumOfOrders(){
        //when
        int sumOfOrders = shop.getSize();
        //then
        assertEquals(3, sumOfOrders);

    }
    @Test
    public void shouldGetSumOfValueOrders(){
        //when
        double sum = shop.sumValueOfOrders();

        //then
        assertEquals(224.13,sum);

    }
    @Test
    public void shouldReturnNullIfOrderDoesntExist(){
        //when
        Order result = shop.getOrder(5);
        //then
        assertNull(result);
    }
    @Test
    public void shouldClearTheOrdersList(){
        //when
        shop.clear();
        //then
        assertEquals(0, shop.getSize());
    }




}
