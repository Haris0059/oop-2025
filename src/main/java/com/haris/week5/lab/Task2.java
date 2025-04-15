package com.haris.week5.lab;

import java.rmi.server.ExportException;

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("You can't deposit negative amount of funds!");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("You can't withdraw negative amount of funds!");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("You can't withdraw more then " + this.balance + " funds!");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Bank Account";
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        super.deposit(getBalance() * interestRate);
    }

    @Override
    public String toString() {
        return "Savings Account";
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double overdraftLimit) {
        super(accountNumber, ownerName, balance);
        this.overdraftLimit = overdraftLimit;
    }
}

class Task2 {
    //Override withdraw() to allow balance to go negative up to overdraft limit.
    //Override toString() for a custom message.
    //	Test Accounts
    //Create one SavingsAccount and one CheckingAccount.
    //Deposit, withdraw, and apply interest.
    //Attempt to overdraw a CheckingAccount and check limit enforcement.
    //Print all accounts using overridden toString().
}
