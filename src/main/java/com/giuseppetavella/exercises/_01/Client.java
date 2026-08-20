package com.giuseppetavella.exercises._01;

public class Client {
    static void main(String[] args) {
        // Email
        // Learning node: Initially the EmailCreator was instantiated 
        // just like all others. Then a semplification was made,
        // so that client knows as few details as possible as to 
        // how to instantiate it. Builder was moved to the Email,
        // instead of being in EmailCreator.
        EmailCreator emailCreator = new EmailCreator("subject", "body");
        
        // SMS
        SMSCreator smsCreator = new SMSCreator.Builder()
                                        .text("my sms")
                                        .build();
        // Push
        PushCreator pushCreator = new PushCreator.Builder()
                                        .deviceToken("xyz")
                                        .build();

        sendNotification(emailCreator);
        sendNotification(smsCreator);
        sendNotification(pushCreator);
        
    }
    
    static void sendNotification(NotificationCreator creator) {
        creator.sendNotification();
    }
}
