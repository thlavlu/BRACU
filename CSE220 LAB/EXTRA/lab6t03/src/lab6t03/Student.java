
package lab6t03;
public class Student {
    public String name;
    public String id;
    public String address;
    public double cgpa;
    public Student(){
    name="Ei name e kono student nai";
    id="Student ei nai, abar id :P";
    address="Naam nai .. thikana ashbe koi theke?";
    cgpa=-4.00;
    }
    public String nameDao(){
       return name;
    }
    public String boloToAmiKe(){
     return id;
    }
    public String addressDao(){
     return address;
    }
    public double cgpaDao(){
        return cgpa;
    }
     public void nameBoshao(String Name){
        name=Name;
    }
    public void addressBoshao(String Address){
    address=Address;
    }
    public void idBoshao(String Id){
    id=Id;
    }
    public void cgpaBoshao(double CGPA){
        cgpa=CGPA;
    }
    public Student(String Name,String Address,String Id,double CGPA){
    name=Name;
    id=Address;
    address=Id;
    cgpa=CGPA;
    }
    public void standUp( ){
    System.out.println(name+" is now standing up");
    }
    public String tellMeYourName(){
    return ("Sir, my name is "+name);
    }
    public void call(String n){
   System.out.println(name+": Hey, "+n+", Sir is calling you!!!!");
    }
   public int add2Numbers(int x, int y){
   return x+y ;
    }
}
