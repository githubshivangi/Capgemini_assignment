package myPackage;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        return (principalAmount * interestRate * time) / 100;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        return principalAmount * (Math.pow((1 + interestRate / 100), time)) - principalAmount;
    }
}

public class Assignment1Q3 {
    public static void main(String[] args) {
        SiCi interest = new SiCi();
        double principalAmount = 1000;
        int time = 2;
        double interestRate = 5;

        System.out.println("Simple Interest: " + interest.simpleInterest(principalAmount, time, interestRate));
        System.out.println("Compound Interest: " + interest.compoundInterest(principalAmount, time, interestRate));
    }
}

