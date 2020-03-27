package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {
    NotificationService notificationService = new NotificationService();  //tworzymy obiekt główny
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }

    @Test
    public void subscribedClientShouldReceiveNotification() {

        notificationService.addSubscriber(client);  //dodajemy go jako subskrybenta

        notificationService.sendNotification(notification);   //wysyłamy notyfikację

        Mockito.verify(client, Mockito.times(1)).receive(notification); //oczekujemy ze klient otrzymał 1 powiadomienie

    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {

        Client secondClient = Mockito.mock(Client.class);
        Client thirdClient = Mockito.mock(Client.class);

        notificationService.addSubscriber(client);  //dodajemy klientów do subskrypcji
        notificationService.addSubscriber(secondClient);
        notificationService.addSubscriber(thirdClient);

        notificationService.sendNotification(notification);  //wysyłamy notyfikację
        Mockito.verify(client, Mockito.times(1)).receive(notification); //oczekujemy z klienci dostaną po jednym powiadomieniu
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);




    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {

        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);
        notificationService.addSubscriber(client);

        notificationService.sendNotification(notification);

        Mockito.verify(client, Mockito.times(1)).receive(notification);

    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

        notificationService.addSubscriber(client);

        notificationService.removeSubscriber(client);

        notificationService.sendNotification(notification);
        Mockito.verify(client, Mockito.never()).receive(notification);

    }
}
