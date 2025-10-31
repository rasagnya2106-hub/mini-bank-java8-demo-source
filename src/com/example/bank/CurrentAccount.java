package com.example.bank;

public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 200.0;

    public CurrentAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + OVERDRAFT_LIMIT >= amount) {
            balance -= amount;
            Transaction.log(owner, "Withdraw", amount);
        } else {
            System.out.println("Overdraft limit exceeded for " + owner);
        }
    }
}
