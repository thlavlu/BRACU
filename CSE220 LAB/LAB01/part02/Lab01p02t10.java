//Created By THLAVLU18301190
package lab01p02t10;

import java.util.Scanner;

public class Lab01p02t10 {

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        int array[] = new int[]{1, 4, 8, 14, 25, 36, 49, 64, 81, 100};
        System.out.println("How many cell do you want to rotate?");
        int cellNum = thl.nextInt();

        int[] newArray = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            newArray[j] = array[i];
        }
        for (int i = 0; i < cellNum; i++) {
            int j, last;
            last = array[array.length - 1];
            for (j = array.length - 2; j >= 0; j--) {
                array[j + 1] = array[j];
            }
            array[0] = last;
        }
        System.out.println(cellNum + " Cell Right Rotate Array:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        //left rotate;
        for (int i = 0; i < cellNum; i++) {
            int k, first;
            first = newArray[0];
            for (k = 0; k < newArray.length - 1; k++) {
                newArray[k] = newArray[k + 1];
            }
            newArray[k] = first;
        }
        System.out.println();
        System.out.println(cellNum + " Cell Left Rotate Array:");
        for (int l = 0; l < newArray.length; l++) {
            System.out.print(newArray[l] + " ");
        }
        System.out.println();
    }

}
