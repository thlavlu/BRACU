//Created By THLAVLU18301190
package lab01p02t07;

public class BankAccount {

    public String name;
    public String address;
    public String accountId;
    public double balance;

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAccountID() {
        return accountId;
    }
    public void setAccountID(String i){
    accountId=i;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void addInterest() {
        balance =balance+ balance *.07;
    }

}
