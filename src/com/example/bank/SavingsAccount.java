package com.example.bank;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    public void applyInterest() {
        balance += balance * INTEREST_RATE;
    }
}
