// HI WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package lab08v2;

/**
 *
 * @author thlavlu
 */
public class Patient {

    private String name;
    private String bloodGroup;
    private int age;
    private static int ID;

    public Patient(String name_, int age_, String bloodGroup_) {

        this.name = name_;
        this.age = age_;
        this.bloodGroup = bloodGroup_;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloolGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getID() {

        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String toString(){
    return "Aame: "+getName()+"Age: "+getAge()+"BloodGroup"+"ID: "+getID();
    }

}
