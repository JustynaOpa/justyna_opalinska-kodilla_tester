package com.kodilla.execution_model.homework;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder (Order order){
        this.orders.add(order);
    }
    public int getSize(){
        return this.orders.size();
    }
    public void clear(){
        this.orders.clear();
    }




    public Order getOrderValue(int value){
        if (value > 0 && value < orders.value)){
            return this.orders.get(value);
        }
        return null;
    }
    public Order getOrderDate(int date) {
        if (date > 0 && value < orders.getDate()) {
            return this.orders.get(value);
        }
        return null;
    }

    public double getMinAndMaxValueOfOrder(){

        orders.stream().max(getOrderValue()).ifPresent(val -> {
            System.out.println("max value is:"+val);
        });

        orders.stream().min(Integer.MAX_VALUE).ifPresent(val -> {
            System.out.println("min value is:"+val);
        });



        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (Order values : orders)

        if (orders.getOrderValue > min)
        return min;
        if
        return max;
    }



    public double sumValueOfOrders(){
        double sum = 0;
        for (double i = 0; i< orders.size(); i++)
            if()
        return sum;
    }

}
