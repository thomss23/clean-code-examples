package com.demo.cleancode.examples.errorhandling.providingcontext;

import com.demo.cleancode.examples.util.exception.InsufficientFundsException;

/**
 Each exception that you throw should provide enough context to determine the source and
 location of an error. In Java, you can get a stack trace from any exception; however, a stack
 trace can’t tell you the intent of the operation that failed.

 Create informative error messages and pass them along with your exceptions. Mention the operation that failed and the type of failure. If you are logging in your application,
 pass along enough information to be able to log the error in your catc
 **/
class AccountGoodExample {
    private double balance;
    private String accountNumber;

    public AccountGoodExample(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for account: " + accountNumber);
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        AccountGoodExample account = new AccountGoodExample("123456789", 1000.0);
        double withdrawalAmount = 1500.0;

        try {
            account.withdraw(withdrawalAmount);
            System.out.println("Withdrawal successful");
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            // Additional error handling or recovery logic...
        }
    }
}

