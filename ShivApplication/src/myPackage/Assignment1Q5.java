package myPackage;

import java.util.Scanner;
class TaxAmount {
    public double calculateTaxAmount(int ctc) {
        double taxAmount = 0;
        if (ctc <= 180000) {
            taxAmount = 0;
        } else if (ctc <= 300000) {
            taxAmount = (ctc - 180000) * 0.1;
        } else if (ctc <= 500000) {
            taxAmount = (ctc - 300000) * 0.2 + (12000);
        } else if (ctc <= 1000000) {
            taxAmount = (ctc - 500000) * 0.3 + (12000 + 100000);
        } else {
            taxAmount = (ctc - 1000000) * 0.3 + (12000 + 100000 + 200000);
        }
        return taxAmount;
    }
}

public class Assignment1Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CTC: ");
        int ctc = sc.nextInt();

        TaxAmount tax = new TaxAmount();
        double taxAmount = tax.calculateTaxAmount(ctc);
        System.out.println("Tax Amount: " + taxAmount);
    }
}
