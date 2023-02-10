package myPackage;

import java.util.ArrayList;
import java.util.List;

class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange(int min, int max) {
        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (isArmstrongNumber(i)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit * lastDigit * lastDigit;
            number /= 10;
        }
        return originalNumber == sum;
    }
}
public class Assignment1Q2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;

        ArmstrongNumBetweenRange armstrong = new ArmstrongNumBetweenRange();
        int[] result = armstrong.armstrongNumbersInRange(min, max);

        System.out.println("Armstrong numbers between " + min + " and " + max + " are: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

