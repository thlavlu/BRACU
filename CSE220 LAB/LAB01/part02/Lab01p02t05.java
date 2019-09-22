//Created By THLAVLU18301190
package lab01p02t05;
public class Lab01p02t05 {
    public static void main(String args[])
   {
    MyReader m = new MyReader();
         int x;
         try{
             x=m.readInteger();
             System.out.println("Perechi, User gave "+x);
         }catch(EitaIntegerNoiException e){
          
             System.out.println("parlam na "+e);
         }
     
   }
}
