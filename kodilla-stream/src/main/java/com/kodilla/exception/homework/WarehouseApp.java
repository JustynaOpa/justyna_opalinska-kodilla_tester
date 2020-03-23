package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("A21"));
        warehouse.addOrder(new Order("A22"));
        warehouse.addOrder(new Order("A23"));
        warehouse.addOrder(new Order("A24"));


        try {
            Order result = warehouse.getOrder("A24");
            System.out.println("Order status: " + result);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order is not in our base");
        } finally {
            System.out.println("Thank you for using our service");
        }


    }
}
