//Created By THLAVLU18301190
package lab01t06;

import java.util.Scanner;

public class Lab01t06 {

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = thl.nextInt();
        }
        int number = 0;
        for (int j = 0; j < arr.length; j++) {
            number = number * 10 + arr[j];
        }
        int newNumber = number;
        int reversedNumber = 0;
        while (newNumber != 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + newNumber % 10;
            newNumber = newNumber / 10;
        }
        if (number == reversedNumber) {
            System.out.println("The number is a Palindrome.");
        } else {
            System.out.println("The number is not a Palindrome.");
        }
    }

}
