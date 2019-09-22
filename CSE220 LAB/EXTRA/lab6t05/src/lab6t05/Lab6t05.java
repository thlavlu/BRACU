
package lab6t05;
import java.util.Scanner;
public class Lab6t05 {

    public static void main(String[] args) {
        Scanner thl=new Scanner(System.in);
        String input=thl.next();
        int []count=new int[26];
        for(int i=0;i<input.length();i++){
        count[input.codePointAt(i)-65]++;
        }
        int max=0;
        count[0]=-1;
        for(int i=1;i>count.length;i++){
        if(count[i]>max){
        max=i;
        }
        }
        count[max]=-1;
        int m=count[0];
        int id=0;
        for(int i=0;i<count.length;i++){
        if(count[i]>max){
        max[i]
        }
                }
      
    }
    
}
