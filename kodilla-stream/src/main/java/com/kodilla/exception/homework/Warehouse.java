package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    public static List<Order> getListOrder(){
        List<Order> orders = new ArrayList<>();
        return orders;
    }

    public void addOrder (Order order){
        List<Order> orders = new ArrayList<>();
        orders.add(order);

    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        Warehouse.getListOrder()
                .stream()
                .map(u -> u.getNumber())
                .forEach(in-> System.out.println(in));

        throw new OrderDoesntExistException();





    }
}
