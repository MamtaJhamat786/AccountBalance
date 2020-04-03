package com.company;

public class SavingAccount extends Account{
  private static double annualInterestRate;


  public SavingAccount(int id, double balance) {
    super(id, balance);
  }

  public double getAnnualInterestRate(){
    return SavingAccount.annualInterestRate;
  }

  public void calculateMonthlyInterest(){
    double monthlyInterest = ((super.getSavingsBalance() * (SavingAccount.annualInterestRate/100))/12);
    super.deposit(monthlyInterest);
  }

  public void setAnnualInterestRate(double annualInterestRate) {
    SavingAccount.annualInterestRate = annualInterestRate;
  }

  public void modifyInterestRate (double newAnnualInterestRate){
    SavingAccount.annualInterestRate = newAnnualInterestRate;
  }
}
