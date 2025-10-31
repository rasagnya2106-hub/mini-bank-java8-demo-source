package com.example.bank;

public abstract class Account {
    protected String owner;
    protected double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction.log(owner, "Deposit", amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            Transaction.log(owner, "Withdraw", amount);
        } else {
            System.out.println("Insufficient funds for " + owner);
        }
    }

    @Override
    public String toString() {
        return owner + " → Balance: " + balance;
    }
}
