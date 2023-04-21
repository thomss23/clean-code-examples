package com.demo.cleancode.examples.functions;


import com.demo.cleancode.examples.util.model.*;
import com.demo.cleancode.examples.util.model.Rectangle;

import java.awt.*;

import static com.demo.cleancode.examples.util.model.ChannelType.*;

/**
 * The ideal number of arguments for a function is <Strong>zero</Strong> (niladic).
 * <br>
 * Next comes <Strong>one</Strong> (monadic), followed closely by <Strong>two</Strong> (dyadic).
 * <br>
 * Three arguments (triadic) should be avoided where possible.
 * <br>
 * More than three (polyadic) requires very special justification—and then shouldn’t be used anyway.
 * <br>
 * <br>
 * When a function seems to need more than two or three arguments, it is likely that some of
 * those arguments could be wrapped into a class of their own.
 * <br>
 * <br>
 * Pay attention to group of variables always passed together in multiple places.
 * They are likely part of a concept that deserves a name of its own and can be encapsulated into an object
 */
public class FunctionArgumentsGood {

    public void printPersonInfo(String salutation, Person person) {
        System.out.println(salutation + " " + person.getName() + " is " + person.getAge() + " years old, and lives in " + person.getCity());
    }

    public void sendNotification(NotificationInfo notificationInfo) {
        // code to send notification
        System.out.println("Sending " + notificationInfo.getNotificationType() + " notification to profile " + notificationInfo.getTargetProfileId() + " in " + notificationInfo.getLanguage() + " language.");
        System.out.println("Message: " + notificationInfo.getMessage());
    }

    /**
     * Instead of a method with 3 responsibilities based on a certain argument function type,
     * we split <strong>sendNotificationForChannel()</strong> method in 3 methods, each one with its own responsibility
     * and encapsulated the arguments in <strong>NotificationInfo</strong> object
     */
    public void sendKafkaNotification(NotificationInfo notificationInfo) {
        //build a kafka message and send notification using KafkaProducer
        System.out.println("Send notification on channel " + KAFKA);
    }

    public void sendAPINotification(NotificationInfo notificationInfo) {
        //build a request and send notification using NotificationAPI
        System.out.println("Send notification on channel " + API);
    }

    public void sendSMTPNotification(NotificationInfo notificationInfo) {
        //build an email template and send notification using SMTP
        System.out.println("Send notification on channel " + SMTP);
    }

    /**
     * width and height arguments were passed together in 2 methods.
     * They can be encapsulated in <strong>Rectangle</strong> object
     */

    public double calculateRectangleArea(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area is " + area);
        return area;
    }

    public void drawRectangle(Graphics graphics, Coordinate coordinate, Rectangle rectangle) {
        System.out.println("Drawing a rectangle");
        graphics.drawRect(coordinate.getPosition1(), coordinate.getPosition2(), rectangle.getWidth(), rectangle.getHeight());
    }
}
