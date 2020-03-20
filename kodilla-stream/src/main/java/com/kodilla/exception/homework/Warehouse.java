package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Warehouse {

    public List<Order> getOrderList() {
        List<Order> orders = new ArrayList<>();
        return orders;
    }

    public void addOrder(Order order) {
        List<Order> orders = new ArrayList<>();
        orders.add(order);

    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        List<Order> orders = Warehouse.getOrderList()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .map(u-> u.getNumber())
                .collect(Collectors.toList());
        System.out.println(orders);

        throw new OrderDoesntExistException();


    }
}
