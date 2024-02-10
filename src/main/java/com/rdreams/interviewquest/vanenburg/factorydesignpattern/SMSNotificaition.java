package com.rdreams.interviewquest.vanenburg.factorydesignpattern;

public class SMSNotificaition implements Notification {
    @Override
    public String sendNotification() {
        return "SMS notification";
    }
}
