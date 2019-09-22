//Created By THLAVLU18301190
package lab01t13;

/**
 *
 * @author TH LAVLU
 */
public class Lab01t13 {

    public static int[] removeOdd(int[] input) {
        int eSize = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                eSize++;

            }
        }

        // int k=0;
        int evenArr[] = new int[eSize];
        int k = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                evenArr[k] = input[i];
                k++;
            }
        }
        return evenArr;
    }

    public static void main(String[] args) {
        int[] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int[] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }
    }
}
