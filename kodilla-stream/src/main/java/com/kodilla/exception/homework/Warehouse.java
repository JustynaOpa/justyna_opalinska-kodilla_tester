package com.kodilla.exception.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> getOrderList() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);

    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        List<String> orders = getOrderList()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .map(u -> u.getNumber())
                .collect(Collectors.toList());

        System.out.println(orders);

        throw new OrderDoesntExistException();


    }
}
