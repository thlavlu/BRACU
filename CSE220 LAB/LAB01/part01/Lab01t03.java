//Created By THLAVLU18301190
package lab01t03;

import java.util.Scanner;

public class Lab01t03 {

    public static void main(String[] args) {

        Scanner thl = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Ener Number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = thl.nextInt();
        }
        System.out.println("Number before sorting:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Number after sorting:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] % 2 == 0) {
                System.out.print(arr[k] + " ");
            }
        }
        System.out.println();
    }
}
