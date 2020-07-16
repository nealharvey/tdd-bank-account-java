package org.xpdojo.bank;

public class Account {

    public int balance;

    public void deposit(int credit) {
        balance += credit;
    }

    public void withdraw(int debit) {
        balance -= debit;
    }

}
