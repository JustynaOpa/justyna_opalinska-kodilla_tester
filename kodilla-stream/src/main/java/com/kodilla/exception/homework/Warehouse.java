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

        List<Order> orders = getOrderList()
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .collect(Collectors.toList());
        if (getOrderList().isEmpty()) {
            throw new OrderDoesntExistException();
        }
        for (Order order : orders){
            System.out.println(order.number);
        }
        return orders.get(0);




    }
}
