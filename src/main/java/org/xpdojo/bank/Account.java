package org.xpdojo.bank;

public class Account {

    public int balance;

    public void deposit(int credit) {
        balance += credit;
    }

    public void withdraw(int debit) {
        balance -= debit;
    }

    public void transfer(int amount, Account destination) {
        this.withdraw(amount);
        destination.deposit(amount);
    }

}
