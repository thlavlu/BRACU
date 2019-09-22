
package lab6t07;

public class Lab6t07 {
    
    public static int[] removeOdd( int [] input){
    
    int []a=new int[input.length];
    int id=0;
    for(int i=0;i<a.length;i++){
    if(input[i]%2==0){
    a[id]=input[i];
    id++;
    }
    }
    int []b=new int[id];
    for(int i=0;i<b.length;i++){
    b[i]=a[i];
    }
    return b;
    }

     public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}

