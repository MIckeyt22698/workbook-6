package com.pluralsight.model.accounts;

import com.pluralsight.model.Valuable;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount) {
        balance += amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return -balance;
    }
    @Override
    public String toString() {
        return "CreditCard - " + name + " | Account: " + accountNumber + " | Balance (debt): $" + balance;
    }
}
