//Created By THLAVLU18301190
package lab01t05;

import java.util.Scanner;

public class Lab01t05 {

    public static void main(String[] args) {
          Scanner thl = new Scanner(System.in);
        int arr[] = new int[15];
        int count[]=new int[10];
        System.out.println("Enter numbers between 0 and 9");
        for(int i=0;i<arr.length;i++){
        arr[i]=thl.nextInt();
        }
        int temp=0;
        for(int i=0;i<arr.length;i++){
        temp=arr[i];
        count[temp]++;
        }
         for(int i=0;i<count.length;i++){
         System.out.println(i+" was found "+count[i]+" times");
         }
    }
    
}
