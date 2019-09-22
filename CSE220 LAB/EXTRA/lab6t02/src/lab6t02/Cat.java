package lab6t02;
public class Cat {
    public String color="white";
    public String action="sitting";
    
    public Cat(){
    }
    
public Cat( String Color){
color=Color;
}    
public Cat( String Color,String Action){
color=Color;
action=Action;
} 
public void printCat(){
System.out.println(color+" cat is "+action);
}
public void changeColor(String Color){
color=Color;
}
}
