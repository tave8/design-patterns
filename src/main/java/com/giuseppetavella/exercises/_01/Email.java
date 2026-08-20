package com.giuseppetavella.exercises._01;

public class Email implements Notification {

    private String subject;
    private String body;

    public Email(Builder builder) {
        this.subject = builder.subject;
        this.body = builder.body;
    }

    @Override
    public void send() {
        System.out.println("sending email...");
    }

    @Override
    public boolean canSend() {
        if(subject == null || body == null) {
            return false;
        }
        return !subject.isEmpty() && !body.isEmpty();
    }


    public static class Builder {
        private String subject;
        private String body;

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Email build() {
            return new Email(this);
        }

    }
    
}
