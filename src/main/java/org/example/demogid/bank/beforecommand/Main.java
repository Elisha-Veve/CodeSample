package org.example.demogid.bank.beforecommand;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Bank burBank = new Bank();
        Account account1 = burBank.createAccount("Jimmy");
        Account account2 = burBank.createAccount("Timmy");
        Account account3 = burBank.createAccount("Blimey");

        account1.deposit(100_000);
        account2.deposit(100_000);
        account3.deposit(100_000);

        //transfer
        int amount = 50_000;
        account2.withdraw(amount);
        account1.deposit(amount);

        account1.withdraw(150_000);
        System.out.println(burBank);
    }
}
