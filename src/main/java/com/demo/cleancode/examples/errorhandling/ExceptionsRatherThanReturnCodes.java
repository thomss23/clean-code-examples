package com.demo.cleancode.examples.errorhandling;

import com.demo.cleancode.examples.util.exception.InsufficientFundsException;
import com.demo.cleancode.examples.util.exception.WithdrawalException;

/**
 Back in the distant past there were many languages that didn’t have exceptions. In those
 languages the techniques for handling and reporting errors were limited. You either set an
 error flag or returned an error code that the caller could check.
 <br>
 <br>
 The problem with these approaches is that they clutter the caller. The caller must
 check for errors immediately after the call. Unfortunately, it’s easy to forget.
 <strong>For this reason it is better to throw an exception when you encounter an error.</strong>
 The calling code is cleaner. Its logic is not obscured by error handling.
 **/
public class ExceptionsRatherThanReturnCodes {

    public class AccountBadExample {
        private double balance;

        public AccountBadExample(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public int withdraw(double amount) {
            if (amount > balance) {
                return -1; // Return code indicating insufficient funds
            }
            balance -= amount;
            return 0; // Return code indicating successful withdrawal
        }
    }

    public class AccountGoodExample {
        private double balance;

        public AccountGoodExample(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void withdraw(double amount) throws WithdrawalException {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds in the account.");
            }
            balance -= amount;
            // Additional processing or logging...
        }
    }



}
