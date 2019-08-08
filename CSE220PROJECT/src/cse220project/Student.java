// HI, WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package cse220project;

/**
 *
 * @author thlavlu
 */
public class Student {
    private String name;
    private int ID;

    public Student(String name, int id) {
        this.name = name;
        this.ID = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int id) {

        this.ID = id;
    }
    public String toString() {
        return " Student name : " + getName() + "  " + " Student ID :" + getID();
    }
}
