
package lab6t06;
import java.util.Scanner;
public class Lab6t06 {
    
    public static int[] positive (int []arr,int s){
    int []b=new int[s];
    int c=0;
    for(int i=0;i<arr.length;i++){
    if(arr[i]>=0){
    b[c]=arr[i];
    c++;
    }
    }
    arr=new int[c];
    for(int i=0;i<c;i++){
    arr[i]=b[i];
    }
    return arr;
    }

    public static void main(String[] args) {
        Scanner thl=new Scanner(System.in);
        int l=thl.nextInt();
        int[]a=new int[l];
        for(int i=0;i<a.length;i++){
        a[i]=thl.nextInt();
        }
        a=positive(a,l);
       for(int i=0;i<a.length;i++){
       System.out.print(a[i]+" ");
       }
    }
    
}
