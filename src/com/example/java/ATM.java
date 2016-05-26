package com.example.java;

public class ATM {
    String user_name;
    double balance;
    int pin;
    public void deposit(double x){
        balance = balance + x;
        System.out.println("Available Balance is : " + balance);
    }
    public void withdraw(double x){
        if (balance - x<0.00) {
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - x;
            System.out.println("Available Balance is : " + balance);
        }
    }
    public void change_pin(int x){
        pin = x;
        System.out.println("Pin changed succesfully");
    }
    public void info(){
        System.out.println("Username : " + user_name + " Balance : " + balance + " Pin : " + pin);
    }
}
