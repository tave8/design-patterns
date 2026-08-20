package com.giuseppetavella.exercises._01;

public class SMS implements Notification {
    
    private final String text;

    public SMS(String text) {
        this.text = text;
    }


    @Override
    public void send() {
        System.out.println("sending SMS");
    }

    @Override
    public boolean canSend() {
        if(text == null) {
            return false;
        }
        return text.length() >= 20;
    }
}
