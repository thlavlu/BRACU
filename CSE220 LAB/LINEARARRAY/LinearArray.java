//Created by THLAVLU
package lineararray;

public class LinearArray {

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void printReverse(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }

    public static int[] copyArray(int[] sourceArray) {
        int[] newArray = new int[sourceArray.length];
        for (int i = 0, j = 0; i < sourceArray.length; i++, j++) {
            newArray[j] = sourceArray[i];
        }
        return newArray;
    }

    public static int[] reverseArray(int a[]) {
        int temp = 0;
        for (int i = 0, j = a.length - 1; i < a.length - 1; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public static int[] shiftLeft(int[] sourceArray, int cell) {
        int i, j;
        for (i = 0; i < cell; i++) {
            for (j = 0; j < sourceArray.length - 1; j++) {
                sourceArray[j] = sourceArray[j + 1];
            }
            sourceArray[j] = 0;
        }

        return sourceArray;
    }

    public static int[] rotateLeft(int[] sourceArray, int c) {
        for (int i = 0; i < c; i++) {
            int j, first;
            first = sourceArray[0];
            for (j = 0; j < sourceArray.length - 1; j++) {
                sourceArray[j] = sourceArray[j + 1];
            }
            sourceArray[j] = first;
        }
        return sourceArray;
    }

    public static int[] shiftRight(int[] sourceArray, int cell) {
        int i, j;
        for (i = 0; i < cell; i++) {
            for (j = sourceArray.length - 2; j >= 0; j--) {
                sourceArray[j + 1] = sourceArray[j];
            }
            sourceArray[i] = 0;
        }

        return sourceArray;
    }

    public static int[] rotateRight(int[] sourceArray, int c) {
        for (int i = 0; i < c; i++) {
            int j, last;
            last = sourceArray[sourceArray.length - 1];
            for (j = sourceArray.length - 2; j >= 0; j--) {
                sourceArray[j + 1] = sourceArray[j];
            }
            sourceArray[0] = last;
        }
        return sourceArray;
    }

    public static boolean insert(int[] sourceArray, int b, int nv, int pos) {
        int[] newArray = new int[sourceArray.length];
        if (b > sourceArray.length) {
            System.out.println("No space Left");
            return false;
        } else {
            for (int i = 0; i < b; i++) {
                newArray[i] = sourceArray[i];
            }
            newArray[b] = nv;
            if (b < newArray.length) {
                for (int j = newArray.length - 2; j >= b; j--) {
                    newArray[j + 1] = sourceArray[j];
                }
            }
            for (int k = 0; k < newArray.length; k++) {
                sourceArray[k] = newArray[k];
            }
        }
        System.out.println("Number of element of inertion " + (pos + 1));
        return true;
    }

    public static boolean removeAll(int[] sourceArray, int ind, int rv) {

        int count = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (rv == sourceArray[i]) {
                count++;
            }
        }
        if (count == 0) {
            return false;
        }
        for (int i = 2; i < sourceArray.length - 2; i++) {
            sourceArray[i] = sourceArray[i + 1];

        }
        sourceArray[sourceArray.length - 1] = 0;
        sourceArray[sourceArray.length - 2] = 0;
        return true;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println("\n///// TEST 01: Copy Array example /////");
        int[] b = copyArray(array);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
//
        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(array); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        printReverse(array); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
//
        System.out.println("\n///// TEST 04: Reverse Array example /////");
        reverseArray(b);
        printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
//
        System.out.println("\n///// TEST 05: Shift Left k cell example /////");
        b = copyArray(array);
        printArray(b);
        b = shiftLeft(b, 3);
        printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
//
        System.out.println("\n///// TEST 06: Rotate Left k cell example /////");
        b = copyArray(array);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b = rotateLeft(b, 3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
//
        System.out.println("\n///// TEST 07: Shift Right k cell example /////");
        b = copyArray(array);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b = shiftRight(b, 3);
        printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 

        System.out.println("\n///// TEST 08: Rotate Right k cell example /////");
        b = copyArray(array);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b = rotateRight(b, 3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
//       
        System.out.println("\n///// TEST 09: Insert example 1 /////");
        b = copyArray(array);
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        boolean bol = insert(b, 70, 2, 6); // This Should Print: No space Left 
        System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
//
        System.out.println("\n///// TEST 09: Insert example 2 /////");
        int[] c = {10, 20, 30, 40, 50, 0, 0};
        printArray(c);
        //bol = insert(c, 2, 70);// This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
        bol = insert(c, 2, 70, 5);  // This Should Print: Number of elements after insertion: 6
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
//    
        System.out.println("\n///// TEST 10: Insert example 3 /////");
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        bol = insert(c, 6, 70, 6); // This Should Print: Number of elements after insertion: 7 
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
//    
        System.out.println("\n///// TEST 11: Remove example 1 /////");  
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        bol = removeAll(c, 7, 90);
        System.out.println(bol); // This Should Print: false
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
//    
        System.out.println("\n///// TEST 12: Remove example 2 /////");
        printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        bol = removeAll(c, 7, 70);
        System.out.println(bol); // This Should Print: true
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
//THL.
    }
}
