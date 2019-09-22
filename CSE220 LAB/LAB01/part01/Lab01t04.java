//Created By THLAVLU18301190
package lab01t04;

import java.util.Scanner;

public class Lab01t04 {

    public static void main(String[] args) {

        Scanner thl = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Ener Number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = thl.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    System.out.println("Ener new Number: ");
                    i--;
                }
            }
        }
    }
}
