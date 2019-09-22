// HI, WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package lab08v2;

import java.util.Scanner;

public class LAB08v2 {

    public static void main(String[] args) {
     Scanner k = new Scanner(System.in);
    WRM w = new WRM();
    char ch ='y';
    do {
     System.out.print("1. RegisterPatient\n2. ServePatient\n3. CancelAll\n"
       + "4. CanDoctorGoHome\n5. ShowAllPatient.\n");
     try {
     int choice = k.nextInt();
     switch(choice) {
     case 1: w.RegisterPatient();
     break;
     case 2: w.ServePatient();
     break;
     case 3:w.CancelAll();
     break;
     case 4: System.out.println(w.CanDoctorGoHome());
     break;
     case 5: w.ShowAllPatient();
     break;
     }
     }
     catch(Exception e)
     {
      System.out.println("Wrong input!\ntry again ! ");    
     }
     
      finally
      {
        System.out.println("Continue press y else press n to exit !");
       ch = k.next().charAt(0);
     if(ch=='y' || ch=='Y' )
     {
       
     }
     else if( ch=='N' || ch=='n' ) 
     {
       System.out.println("Exited successfully!");
     }
     else{
      System.out.println("Wrong input");
     }
      }
     
    }while(ch=='Y' || ch=='y');
    
    
   }
}
 