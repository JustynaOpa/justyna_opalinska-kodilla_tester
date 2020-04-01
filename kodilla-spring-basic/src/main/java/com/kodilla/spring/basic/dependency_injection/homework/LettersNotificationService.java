package com.kodilla.spring.basic.dependency_injection.homework;

public class LettersNotificationService implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("Letter delivered to: " + address);
    }
    @Override
    public void fail(String address) {
        System.out.println("Letter not delivered to: " + address);
    }
}
