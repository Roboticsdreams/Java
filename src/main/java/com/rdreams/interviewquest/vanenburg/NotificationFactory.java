package com.rdreams.interviewquest.vanenburg;

import com.rdreams.interviewquest.vanenburg.factorydesignpattern.EmailNotification;
import com.rdreams.interviewquest.vanenburg.factorydesignpattern.Notification;
import com.rdreams.interviewquest.vanenburg.factorydesignpattern.SMSNotificaition;

/*
Consider we want to implement a notification service through email and SMS notifications.
Let’s try to implement this with the help of the factory method design pattern
 */
public class NotificationFactory {
    public Notification createNotification(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "SMS":
                return  new SMSNotificaition();

            case "Email":
                return  new EmailNotification();

            default:
                throw new IllegalArgumentException("unknown");
        }
    }
}
