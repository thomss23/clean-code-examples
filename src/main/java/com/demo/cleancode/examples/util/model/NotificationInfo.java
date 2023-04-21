package com.demo.cleancode.examples.util.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotificationInfo {

    private final String targetProfileId;
    private final String notificationType;
    private final String language;
    private final String message;
}
