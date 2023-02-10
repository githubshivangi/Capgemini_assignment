package myPackage;

import java.util.Scanner;

class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int originalNum = num;
        int result = 0;
        int digits = 0;

        while (originalNum != 0) {
            originalNum /= 10;
            ++digits;
        }

        originalNum = num;
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }

        return (result == num);
    }
}

public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        ArmstrongOrNot aon = new ArmstrongOrNot();
        boolean result = aon.armstrongCheck(num);

        if (result) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

