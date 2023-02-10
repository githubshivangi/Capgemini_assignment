package myPackage;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        int passedSubjects = 0;
        if (subject1Marks > 60) {
            passedSubjects++;
        }
        if (subject2Marks > 60) {
            passedSubjects++;
        }
        if (subject3Marks > 60) {
            passedSubjects++;
        }
        if (passedSubjects == 3) {
            return "Passed";
        } else if (passedSubjects >= 2) {
            return "Promoted";
        } else {
            return "Failed";
        }
    }
}

public class Assignment1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResultDeclaration declaration = new ResultDeclaration();

        System.out.print("Enter marks for subject 1: ");
        double subject1Marks = sc.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double subject2Marks = sc.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double subject3Marks = sc.nextDouble();

        String result = declaration.declareResults(subject1Marks, subject2Marks, subject3Marks);
        System.out.println("Result: " + result);
    }
}

