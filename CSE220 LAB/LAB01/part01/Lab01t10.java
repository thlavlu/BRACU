//Created By THLAVLU18301190
package lab01t10;

import java.util.Scanner;

public class Lab01t10 {

    public static void season(int m, int d) {
        if ((d >= 16 && d <= 31 && m == 12) || (d >= 1 && d <= 31 && m == 1) || (d >= 1 && d <= 28 && m == 2) || (d >= 1 && d <= 15 && m == 3)) {
            System.out.println("Winter");
        }
        if ((d >= 16 && d <= 31 && m == 3) || (d >= 1 && d <= 30 && m == 4) || (d >= 1 && d <= 31 && m == 5) || (d >= 1 && d <= 15 && m == 6)) {
            System.out.println("Spring");
        }
        if ((d >= 16 && d <= 30 && m == 6) || (d >= 1 && d <= 31 && m == 7) || (d >= 1 && d <= 30 && m == 8) || (d >= 1 && d <= 15 && m == 9)) {
            System.out.println("Summer");
        }
        if ((d >= 16 && d <= 31 && m == 9) || (d >= 1 && d <= 31 && m == 10) || (d >= 1 && d <= 30 && m == 11) || (d >= 1 && d <= 15 && m == 12)) {
            System.out.println("Fall");
        }
    }

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        System.out.println("Enter the month");
        int mon = thl.nextInt();
        System.out.println("Enter the day");
        int day = thl.nextInt();
        season(mon, day);
    }
}
