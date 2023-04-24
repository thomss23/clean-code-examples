package com.demo.cleancode.examples.functions;

import com.demo.cleancode.examples.util.model.ChannelType;

import java.awt.*;

import static com.demo.cleancode.examples.util.model.ChannelType.*;

public class FunctionArgumentsBad {

    public void printPersonInfo(String salutation, String name, String age, String city) {
        System.out.println(salutation + " " + name + " is " + age + " years old, and lives in " + city);
    }

    public void sendNotification(String targetProfileId, String notificationType, String language, String message) {
        // code to send notification
        System.out.println("Sending " + notificationType + " notification to profile " + targetProfileId + " in " + language + " language.");
        System.out.println("Message: " + message);
    }

    public void sendNotificationForChannel(String targetProfileId, String notificationType, String language, String message, ChannelType channelType) {
        if (channelType.equals(KAFKA)) {
            //build a kafka message and send notification using KafkaProducer
            System.out.println("Send notification on kafka channel");
        }
        if (channelType.equals(API)) {
            //build a request and send notification using NotificationAPI
            System.out.println("Send notification on API channel");
        }
        if (channelType.equals(SMTP)) {
            //build an email template and send notification using SMTP
            System.out.println("Send notification on SMTP channel");
        }
    }

    public double calculateRectangleArea(double width, double height) {
        double area = width * height;
        System.out.println("Area is " + area);
        return area;
    }

    public void drawRectangle(Graphics g, int x, int y, int width, int height) {
        System.out.println("Drawing a rectangle");
        g.drawRect(x, y, width, height);
    }
}
