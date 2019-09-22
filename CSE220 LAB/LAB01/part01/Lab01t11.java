//Created By THLAVLU18301190
package lab01t11;

import java.util.Scanner;

public class Lab01t11 {

    public static int allDigitsOdd(int num) {
        int oddCount = 0;
        int evenCount = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 != 0) {
                oddCount++;
            } else {
                evenCount++;
            }
            num = num / 10;
        }
        return oddCount;
    }

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);

        System.out.println("Enter number of the elements.");
        int n = thl.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter a positive integer.");
        for (int i = 0; i < n; i++) {
            arr[i] = thl.nextInt();
        }
        int number = 0;
        for (int j = 0; j < arr.length; j++) {
            number = number * 10 + arr[j];
        }
        int oCount = allDigitsOdd(number);
        if (oCount == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
