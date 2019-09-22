package lab01t02;

import java.util.Scanner;

public class Lab01t02 {

    public static void main(String[] args) {

        Scanner thl = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Ener Number: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = thl.nextInt();
        }
        System.out.println("Number before swap:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(" " + arr[j]);
        }
        System.out.println();
        int min = arr[0], max = arr[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            } else if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        arr[minIndex] = max;
        arr[maxIndex] = min;
        System.out.println("Number after swap:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(" " + arr[k]);
        }
        System.out.println();
    }

}
