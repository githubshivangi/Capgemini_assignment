package javaAssignmentOops;


import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
int totalDeposits = 10000;
int creditLimit = 2000;

@Override
public int getCash() {
    return totalDeposits + creditLimit;
}
}

class SavingsAccount extends Assignment2Q3 {
int totalDeposits = 10000;
int fixedDepositAmount = 5000;

@Override
public int getCash() {
    return totalDeposits + fixedDepositAmount;
}
}

public class Assignment2Q3 {
public int totalCashInBank(ArrayList<Assignment2Q3> accounts) {
int totalCash = 0;
for (Assignment2Q3 account : accounts) {
totalCash += account.getCash();
}
return totalCash;
}

public int getCash() {
    return 0;
}

public static void main(String[] args) {
    CurrentAccount ca = new CurrentAccount();
    SavingsAccount sa = new SavingsAccount();
    ArrayList<Assignment2Q3> accounts = new ArrayList<>();
    accounts.add(ca);
    accounts.add(sa);
    Assignment2Q3 bank = new Assignment2Q3();
    System.out.println("Total cash in the bank: " + bank.totalCashInBank(accounts));
}
}
