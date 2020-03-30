package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getSize() {
        return this.orders.size();
    }

    public void clear() {
        this.orders.clear();
    }

    public Order getOrder(int index) {
        if (index > 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

    public double getMinValueOfOrder() {

        double minValue = Integer.MAX_VALUE;
        for (Order value : orders) {
            if (value.getOrderValue() < minValue) {
                minValue = value.getOrderValue();
            }
        }
        return minValue;
    }

    public double getMaxValueOfOrder() {
        double maxValue = Integer.MIN_VALUE;
        for (Order value : orders) {
            if (value.getOrderValue() > maxValue) {
                maxValue = value.getOrderValue();
            }
        }
        return maxValue;
   }

    public List<Order> getOrdersBetween(LocalDate start, LocalDate end) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders){
            if (order.getDate().isAfter(start) && order.getDate().isBefore(end)){
                result.add(order);
            }
        }
        return result;
    }

    public double sumValueOfOrders() {
        double sum = 0;
        for(Order value: orders)
            sum = sum + value.orderValue;
        return sum;
    }
}

