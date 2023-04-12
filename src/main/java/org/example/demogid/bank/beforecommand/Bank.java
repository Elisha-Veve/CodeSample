package org.example.demogid.bank.beforecommand;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;
    private int numberOfAccounts;

    public Account createAccount(String name) {
        this.numberOfAccounts++;
        accounts = new HashMap<>();
        Account account = new Account(name, numberOfAccounts);
        accounts.put(numberOfAccounts, account);
        return account;
    }

    public Account getAccount(int number) {
        return accounts.get(number);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
