//Created By THLAVLU18301190
package lab01p02t07;
public class Lab01p02t07 {
    public static void main(String[] args) {
  BankAccount acc1=new BankAccount();
  BankAccount acc2=new BankAccount();
  BankAccount acc3=new BankAccount();
  acc1.setName("George");
  acc1.setAccountID("18301086");
  acc1.setAddress("Dinajpur");
  acc1.setBalance(100);
  acc2.setName("Anik");
  acc2.setAccountID("18301189");
  acc2.setAddress("Pabna");
  acc2.setBalance(2000);
  acc3.setName("Dipu");
  acc3.setAccountID("18301084");
  acc3.setAddress("Khulna");
  acc3.setBalance(3000);
  acc1.addInterest();
  acc3.addInterest();
  System.out.println("Name: "+acc1.getName()+"\nAccountId: "+acc1.getAccountID()+"\nBalance: "+acc1.getBalance()+"\nAddress: "+acc1.getAddress());
  System.out.println("\nName: "+acc2.getName()+"\nAccountId: "+acc2.getAccountID()+"\nBalance: "+acc2.getBalance()+"\nAddress: "+acc2.getAddress());
  System.out.println("\nName: "+acc3.getName()+"\nAccountId: "+acc3.getAccountID()+"\nBalance: "+acc3.getBalance()+"\nAddress: "+acc3.getAddress());

    }
    
}
