//Created By THLAVLU18301190
package lab01p02t04;
//import java.util.InputMismatchException;
//import java.util.Scanner;

import java.util.*;

public class Lab01p02t04 {

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        try {
            int n = thl.nextInt();
            int a[] = new int[n];
            a[5] = 99;
            int x = n / 0;
        } catch (ArithmeticException e) {
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (InputMismatchException e) {
        } catch (Exception e) {

        } finally {
            System.out.println("THE END");
        }
    }

}
