package com.company;

public class Account {
  private int id;
  private double savingsBalance;

  public Account(int id, double balance) {
    if (id < 1){
      System.out.println("Account id must be >= 1");
    }else {
      this.id = id;
      this.savingsBalance = balance;
    }
  }

  public int getId() {
    return id;
  }

  public double getSavingsBalance() {
    return savingsBalance;
  }
  
  public void withdraw(double amount) {
    this.savingsBalance -= amount;
  }

  public void deposit(double amount) {
    this.savingsBalance += amount;
  }
  
}

