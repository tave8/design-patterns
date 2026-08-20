package com.giuseppetavella.exercises._01;

public class PushCreator implements  NotificationCreator{
    
    private final Builder builder;

    public PushCreator(Builder builder) {
        this.builder = builder;
    }


    @Override
    public Notification createNotification() {
        return new Push(builder.deviceToken);
    }

    public static class Builder {
        private String deviceToken;

        public Builder deviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
            return this;
        }

        public PushCreator build() {
            return new PushCreator(this);
        }

    }
}
