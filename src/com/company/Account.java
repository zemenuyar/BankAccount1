package com.company;

public class Account {
    private int number;
    private String username;
    private double balance;
    private  int PIN;
    private int withdrawal;

    public Account(int number, String username, double balance, int PIN) {
        this.number = number;
        this.username = username;
        this.balance = balance;
        this.PIN = PIN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public Account() {
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdrawal(double Amount) {
        balance = balance - Amount;
    }

    }

