
package lab01t01;

public class Lab01t01 {

    public static void main(String[] args) {
     int a[]={2,4,5,7};
     //boolean found=false;
    // if(a[0]==6||a[a.length-1]==6){
    // found=true;
    // }
     System.out.println(firstLast(a));
    }
    
    public static boolean firstLast(int[] a){
         if(a[0]==6||a[a.length-1]==6){
      return true;
     }
         return false ;
    }
        
    
    }