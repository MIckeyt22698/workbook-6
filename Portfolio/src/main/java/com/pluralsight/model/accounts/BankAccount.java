package com.pluralsight.model.accounts;

import com.pluralsight.model.Valuable;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
    @Override
    public String toString() {
        return "BankAccount - " + name + " | Account: " + accountNumber + " | Balance: $" + balance;
    }
}
