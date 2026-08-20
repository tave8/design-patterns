package com.giuseppetavella.exercises._01;

public class Push implements Notification {
    
    private final String deviceToken;

    public Push(String deviceToken) {
        this.deviceToken = deviceToken;
    }


    @Override
    public void send() {
        System.out.println("sending push...");
    }

    @Override
    public boolean canSend() {
        if(deviceToken == null) {
            return false;
        }
        return !deviceToken.isEmpty();
    }
}
