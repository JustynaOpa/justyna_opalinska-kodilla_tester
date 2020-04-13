package com.kodilla.mockito.homework;

import com.kodilla.notification.Client;
import com.kodilla.notification.Localisation;
import com.kodilla.notification.Notification;
import com.kodilla.notification.Regimen;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class WeatherAlertsTestSuite {
    WeatherAlerts weatherAlerts = new WeatherAlerts();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Regimen regimen = Mockito.mock(Regimen.class);
    Localisation localisation = Mockito.mock(Localisation.class);

    @Test
    public void subscriberClientShouldReceiveNotificationAndRegimen(){
        weatherAlerts.addSubscriber(client);
        weatherAlerts.addLocalisation(localisation);
        weatherAlerts.sendNotificationAboutLocalisation(notification);
        weatherAlerts.sendRegimen(regimen);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client, Mockito.times(1)).receive(regimen);
        Mockito.verify(client,Mockito.times(1)).add(localisation);


    }
    @Test
    public void subscriberClientCanCancelNotification(){
        weatherAlerts.addSubscriber(client);
        weatherAlerts.addLocalisation(localisation);
        Localisation localisation1 = Mockito.mock(Localisation.class);
        weatherAlerts.addLocalisation(localisation1);

        weatherAlerts.removeLocalisation(localisation);
        weatherAlerts.sendNotificationAboutLocalisation(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }
    @Test
    public void subscriberClientCanCancelAllNotification(){
        weatherAlerts.addSubscriber(client);
        weatherAlerts.removeSubscriber(client);

        weatherAlerts.sendNotificationAboutLocalisation(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }
    @Test
    public void notificationShouldBeSendToGroup(){
        weatherAlerts.addSubscriber(client);
        Localisation localisation1 = Mockito.mock(Localisation.class);
        Localisation localisation2 = Mockito.mock(Localisation.class);

        weatherAlerts.addClientToLocalisation(localisation1);
        weatherAlerts.addClientToLocalisation(localisation2);

        weatherAlerts.sendNotificationAboutLocalisation(notification);
        Mockito.verify(client, Mockito.times(1)).add(localisation1);
        Mockito.verify(client, Mockito.times(1)).add(localisation2);

    }
    @Test
    public void regimenShouldBeSendToAllClients(){
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        weatherAlerts.addSubscriber(client1);
        weatherAlerts.addSubscriber(client2);
        weatherAlerts.addSubscriber(client3);
        weatherAlerts.sendRegimen(regimen);
        Mockito.verify(client1, Mockito.times(1)).receive(regimen);
        Mockito.verify(client2, Mockito.times(1)).receive(regimen);
        Mockito.verify(client3, Mockito.times(1)).receive(regimen);


    }
    @Test
    public void isPossibleRemoveLocalisation(){
        weatherAlerts.addSubscriber(client);
        weatherAlerts.addLocalisation(localisation);
        weatherAlerts.removeLocalisation(localisation);

        Mockito.verify(client, Mockito.times(1)).add(localisation);
        Mockito.verify(client, Mockito.times(1)).remove(localisation);

    }

}
