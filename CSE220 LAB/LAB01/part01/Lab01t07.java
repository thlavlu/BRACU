//Created By THLAVLU18301190
package lab01t07;

import java.util.Scanner;

public class Lab01t07 {

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the numbers.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = thl.nextInt();
        }
        System.out.println("Enter the number between 0 and 9 for choosing the array cell.");
        int cellNum = thl.nextInt();
        for (int i = 0; i <= arr[cellNum]; i++) {
            System.out.print("*");
            System.out.println();
        }

    }

}
