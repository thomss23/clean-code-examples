package com.demo.cleancode.examples.errorhandling.providingcontext;

class AccountBadExample {
    private double balance;

    public AccountBadExample(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds in the account.");
        }
        balance -= amount;
    }


    public static void main(String[] args) {
        AccountBadExample account = new AccountBadExample(1000.0);
        double withdrawalAmount = 1500.0;

        try {
            account.withdraw(withdrawalAmount);
            System.out.println("Withdrawal successful");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // Additional error handling or recovery logic...
        }
    }
}