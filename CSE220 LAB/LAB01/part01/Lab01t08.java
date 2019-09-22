//Created By THLAVLU18301190
package lab01t08;

import java.util.Scanner;

public class Lab01t08 {

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        System.out.println("Enter matrix size.");
        int n = thl.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        System.out.println("Enter number for A matrix.");
        for (int i = 0; i < A.length; i++) {
            A[i] = thl.nextInt();
        }
        System.out.println("Enter number for B matrix.");
        for (int i = 0; i < A.length; i++) {
            B[i] = thl.nextInt();
        }
        int C[] = new int[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = 5 * A[i] - B[i];
        }
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
