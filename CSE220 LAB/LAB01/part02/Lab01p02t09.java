//Created By THLAVLU18301190
package lab01p02t09;

import java.util.Scanner;

public class Lab01p02t09 {
public static void rootMethod(int d,int e,int f){
        double determinet=Math.sqrt(e*e-4*d*f);
        double fRoot=(-e+determinet)/(2*d);
        System.out.println("First root is: "+fRoot);
        }
    public static void main(String[] args) {
        
        
        Scanner thl = new Scanner(System.in);
        System.out.println("Enter number for a.");
        int a = thl.nextInt();
        System.out.println("Enter number for b.");
        int b = thl.nextInt();
        System.out.println("Enter number for c.");
        int c = thl.nextInt();
        if ((a == 1) && (b == 1) && (c > 0)) {
            System.out.println("Quadratic equation: x2" + "+x" + "+" + c);
        } else if ((a == 1) && (b == 1) && (c < 0)) {
            System.out.println("Quadratic equation: x2" + "+x" + c);
        } else if ((a > 1) && (b > 1) && (c > 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "+" + b + "x" + "+" + c);
        } else if ((a > 1) && (b > 1) && (c < 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "+" + b + "x" + c);
        } else if ((a == 1) && (b > 1) && (c > 0)) {
            System.out.println("Quadratic equation: x2" + "+" + b + "x" + "+" + c);
        } else if ((a == 1) && (b > 1) && (c < 0)) {
            System.out.println("Quadratic equation: x2" + "+" + b + "x" + c);
        } else if ((a == 1) && (b == -1) && (c < 0)) {
            System.out.println("Quadratic equation: x2" + "-x" + c);
        } else if ((a == 1) && (b == -1) && (c > 0)) {
            System.out.println("Quadratic equation: x2" + "-x+" + c);
        } else if ((a == 1) && (b < -1) && (c < 0)) {
            System.out.println("Quadratic equation: x2" + b + "x" + c);
        } else if ((a == 1) && (b < -1) && (c > 0)) {
            System.out.println("Quadratic equation: x2" + b + "x+" + c);
        } else if ((a > 1) && (b == 1) && (c > 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "+" + "x" + "+" + c);
        } else if ((a == 1) && (b < -1) && (c < -1)) {
            System.out.println("Quadratic equation: x2" + b + "x" + c);
        } else if ((a == 1) && (b < -1) && (c > 0)) {
            System.out.println("Quadratic equation: x2" + b + "x+" + c);
        } else if ((c < 0) && (a == -1) && (b == -1)) {
            System.out.println("Quadratic equation: -x2" + "-x" + c);
        } else if ((a < -1) && (b < -1) && (c < 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + b + "x" + c);
        } else if ((a < -1) && (b < -1) && (c > 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + b + "x+" + c);
        } else if ((a < -1) && (b == -1) && (c > 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "-x+" + c);
        } else if ((a < -1) && (b == -1) && (c < 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "-x" + c);
        } else if ((a == -1) && (b < -1) && (c < 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "-x" + c);
        } else if ((a == -1) && (b < -1) && (c > 0)) {
            System.out.println("Quadratic equation: -x2" + "-x+" + c);
        } else if ((a < -1) && (b == 1) && (c < -1)) {
            System.out.println("Quadratic equation: " + a + "x2" + "+" + b + c);
        } else if ((a < -1) && (b > 1) && (c < -1)) {
            System.out.println("Quadratic equation: " + a + "x2" + "+" + b + "x" + c);
        } else if ((a < -1) && (b > 1) && (c > 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "+" + b + "x+" + c);
        } else if ((a == -1) && (b > 1) && (c > 0)) {
            System.out.println("Quadratic equation: -x2" + "+" + b + "+" + c);
        } else if ((a == -1) && (b > 1) && (c < 0)) {
            System.out.println("Quadratic equation: -x2" + "+" + b + c);
        } else if ((a > 1) && (b == -1) && (c < 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + "-x" + c);
        } else if ((a > 1) && (b < -1) && (c > 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + b + "x+" + c);
        } else if ((a > 1) && (b < -1) && (c < 0)) {
            System.out.println("Quadratic equation: " + a + "x2" + b + "x" + c);
        } else if ((a == -1) && (b == -1) && (c > 0)) {
            System.out.println("Quadratic equation: -x2" + "-x+" + c);
        } else if ((a == -1) && (b == -1) && (c < 0)) {
            System.out.println("Quadratic equation: -x2" + "-x" + c);
        }
        rootMethod(a,b,c);
    }
}
