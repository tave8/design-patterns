package com.giuseppetavella.exercises._01;

public class SMSCreator implements NotificationCreator {
    
    private final Builder builder;

    public SMSCreator(Builder builder) {
        this.builder = builder;
    }


    @Override
    public Notification createNotification() {
        return new SMS(builder.text);
    }

    public static class Builder {
        private String text;

        public SMSCreator.Builder text(String subject) {
            this.text = subject;
            return this;
        }

        public SMSCreator build() {
            return new SMSCreator(this);
        }

    }
    
}
