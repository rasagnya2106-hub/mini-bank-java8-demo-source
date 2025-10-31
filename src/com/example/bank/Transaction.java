package com.example.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    public static void log(String owner, String type, double amount) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(timestamp + " | " + owner + " | " + type + " | " + amount);
    }
}
