package com.example.bank;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("=== Mini Bank Java 8 Demo ===");

        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("Alice", 1000.0));
        accounts.add(new CurrentAccount("Bob", 500.0));

        for (Account acc : accounts) {
            acc.deposit(200);
            acc.withdraw(150);
            System.out.println(acc);
        }
    }
}
