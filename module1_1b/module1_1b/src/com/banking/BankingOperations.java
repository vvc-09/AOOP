package com.banking;

public class BankingOperations {
	private double balance;

    public BankingOperations(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to view balance
    public void viewBalance() {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            System.out.println("User " + session.getUserName() + "'s Balance: " + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        UserSession session = UserSession.getInstance();
        if (session.isLoggedIn()) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Amount " + amount + " withdrawn. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
