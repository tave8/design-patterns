package com.giuseppetavella.exercises._01;

public class EmailCreator implements NotificationCreator {

    private final Email.Builder builder;
    
    public EmailCreator(String subject, String body) {
        this.builder = new Email.Builder();
        
        builder.subject(subject).body(body);
    }
    

    @Override
    public Notification createNotification() {
        return new Email(builder);
    }
    
    
}
