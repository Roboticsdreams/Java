package com.rdreams.interviewquest.vanenburg;

import com.rdreams.interviewquest.vanenburg.factorydesignpattern.Notification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NotificationFactoryTest {
    NotificationFactory obj = new NotificationFactory();
    @Test
    public void Notification_TestCase01() {
        Notification notification = obj.createNotification("SMS");
        String actualOutput = notification.sendNotification();
        String expectedOutput = "SMS notification";
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void Notification_TestCase02() {
        Notification notification = obj.createNotification("Email");
        String actualOutput = notification.sendNotification();
        String expectedOutput = "Email Notification";
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void Notification_TestCase03() {

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Notification notification = obj.createNotification("other");
            notification.sendNotification();
        }, "unknown");

        assertEquals("unknown", thrown.getMessage());
    }
}
