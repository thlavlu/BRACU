//Created By THLAVLU18301190
package lab01t12;

import java.util.Scanner;

public class Lab01t12 {

    public static void before(int M1, int D1, int M2, int D2) {

        if (((M1 < M2) && (D1 < D2)) || ((M2 > M1) && (D1 > D2))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        System.out.println("Enter first month.");
        int m1 = thl.nextInt();
        System.out.println("Enter first day.");
        int d1 = thl.nextInt();
        System.out.println("Enter second month.");
        int m2 = thl.nextInt();
        System.out.println("Enter second day.");
        int d2 = thl.nextInt();
        before(m1, d1, m2, d2);
    }

}
