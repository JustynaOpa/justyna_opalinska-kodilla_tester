package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private String login;
    double orderValue;
    LocalDate date;

    public Order(String login, double orderValue, LocalDate date) {
        this.login = login;
        this.orderValue = orderValue;
        this.date = date;
    }

    public String getLogin() {
        return login;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "login='" + login + '\'' +
                ", orderValue=" + orderValue +
                ", date=" + date +
                '}';
    }
}
