package com.ironhack;

public class CreditCard {
    private final double MAX_BALANCE = 2000;
    private String accountHolder;
    private double balance;
    private double salary;


    public CreditCard(double salary) {
       this.setSalary(salary);


    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public CreditCard(String accountHolder, double balance) {
        setAccountHolder(accountHolder);
        setBalance(balance);
    }

   public CreditCard(String accountHolder) {
        setAccountHolder(accountHolder);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > MAX_BALANCE) {
            this.balance = MAX_BALANCE;
        } else {
        this.balance = balance;

        }
    }
    public void substractBalance(double balance) {
        this.balance -= balance;
    }

    public void substractBalance() {
        this.balance -= 1.0;
    }
    public void addBalance(double balance) {
        this.balance += balance;
    }
}
