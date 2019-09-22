//Created By THLAVLU18301190
package lab01t09;

import java.util.Scanner;

public class Lab01t09 {

    public static void squareM(int[] s) {
        System.out.println("After squaring.");
        for (int i = 0; i < s.length; i++) {
            System.out.print(+s[i] * s[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the number for square.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = thl.nextInt();
        }
        System.out.println("Before squaring.");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        squareM(arr);
    }

}
