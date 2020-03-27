package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Localisation;
import com.kodilla.notification.Notification;
import com.kodilla.notification.Regimen;

import java.util.HashSet;
import java.util.Set;

public class WeatherAlerts {
    private Set<Client> clients = new HashSet<>();


    public void addSubscriber(Client client){
        this.clients.add(client);

    }
    public void addLocalisation(Localisation localisation){
        this.clients.forEach(client->client.add(localisation));

    }
    public void addClientToLocalisation(Localisation client){
        this.clients.forEach(b->b.add(client));
    }
    public void sendNotificationAboutLocalisation(Notification notification){
        this.clients.forEach(client -> client.receive(notification));
    }
    public void sendRegimen(Regimen regimen){
        this.clients.forEach(client -> client.receive(regimen));
    }
    public void removeSubscriber(Client client){
        this.clients.remove(client);
    }
    public void removeLocalisation(Localisation localisation){
        this.clients.remove(localisation);
    }
}
