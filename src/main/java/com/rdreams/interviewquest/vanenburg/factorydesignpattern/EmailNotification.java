package com.rdreams.interviewquest.vanenburg.factorydesignpattern;

public class EmailNotification implements Notification {
    @Override
    public String sendNotification() {
        return "Email Notification";
    }
}
