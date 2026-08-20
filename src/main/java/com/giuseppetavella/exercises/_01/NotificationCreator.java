package com.giuseppetavella.exercises._01;

public interface NotificationCreator {
    default void sendNotification() {
        Notification notification = createNotification();
        if(notification.canSend()) {
            notification.send();
            System.out.println("notification sent");
        } else {
            System.out.println("could not send notification");
        }
    };
    
    Notification createNotification();
}
