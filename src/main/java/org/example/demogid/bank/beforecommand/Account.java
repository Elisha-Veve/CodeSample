package org.example.demogid.bank.beforecommand;

public class Account {
    private String name;
    private int number;
    private  int balance;

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) throws IllegalAccessException {
        if (amount > this.balance)
            throw new IllegalAccessException("You do not have access to the funds you are attempting tp withdraw");
        this.balance -= amount;

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
