package com.company;

public class Main {

    public static void main(String[] args) {

      SavingAccount saver1 = new SavingAccount(1,2000);
      SavingAccount saver2 = new SavingAccount(2,3000);

      saver1.setAnnualInterestRate(4.0);
      saver2.setAnnualInterestRate(4.0);

      //Innitial Savings Balance
      System.out.println("Saver1: SavingsBalance = " + saver1.getSavingsBalance());
      System.out.println("Saver2: SavingsBalance = " + saver2.getSavingsBalance());

      saver1.calculateMonthlyInterest();
      saver2.calculateMonthlyInterest();

      System.out.println("Initial Interest Rate " + saver1.getAnnualInterestRate());
      System.out.println("Saver1: Savings Balance = " + saver1.getSavingsBalance());
      System.out.println("Saver2: Savings Balance = " + saver2.getSavingsBalance());
      System.out.println("");

      saver1.modifyInterestRate(5.0);
      saver2.modifyInterestRate(5.0);
      saver1.calculateMonthlyInterest();
      saver2.calculateMonthlyInterest();
      System.out.println("New Interest Rate " + saver1.getAnnualInterestRate());
      System.out.println("Saver1 : New Savings Balance = " + saver1.getSavingsBalance());
      System.out.println("Saver2 : New Savings Balance = " + saver2.getSavingsBalance());

    }
}
