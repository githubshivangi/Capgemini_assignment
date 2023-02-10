package myPackage;

import java.util.Scanner;
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toCheckValue) {
                return true;
            }
        }
        return false;
    }
}


public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int valueToCheck = sc.nextInt();
        SearchArray searchArray = new SearchArray();
        if (searchArray.searchArray(arr, valueToCheck)) {
            System.out.println(valueToCheck + " is found in the array.");
        } else {
            System.out.println(valueToCheck + " is not found in the array.");
        }
        sc.close();
    }
}


