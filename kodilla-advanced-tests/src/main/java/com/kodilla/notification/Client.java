package com.kodilla.notification;

public interface Client {
    void receive(Notification notification);
    void receive(Regimen regimen);
    void add(Localisation localisation);
    void remove(Localisation localisation);

}
