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
public class Book {

    private String bookTitle;
    private String auther;
    private static int count=1;
    int serial;
Object book[] = new Object[20];
    public Book(String bookTitle, String auther) {
        this.bookTitle = bookTitle;
        this.auther = auther;
        serial=serial+count++;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuther() {

        return auther;
    }

    public void setAuther(String auther) {

        this.auther = auther;
    }

    public int getSerial(){
    
    return serial;
    
    }

    public String toString() {
        return  " Serial : "+ getSerial()+ " BookTitle : " + getBookTitle() + "  " + " Auther name :" + getAuther();
    }
    
    
}
