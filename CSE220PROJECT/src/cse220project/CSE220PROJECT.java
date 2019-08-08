// HI, WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package cse220project;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thlavlu
 */
public class CSE220PROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //   Node nd=new Node();
        char ch = 'y';
        librarian lb = new librarian();
        int option;
        Scanner thl = new Scanner(System.in);

        do {
            System.out.println("Book edit mode.\n1. Add Book.\n2. Show Book.\n3. Remove Book.\n"
                    + "Students edit mode\n4. Students registration.\n5. Show All Students.\n6. Find Student\n7. Serve Next Student. ");
            try {
                option = thl.nextInt();
                if (option > 0 && option < 10) {
                    switch (option) {
                        case 1 : lb.regiBook();
                        break;
                        case 2 : lb.ShowBook();
                        break;
                        case 3 : lb.deleteBook();
                        break;
                        case 4 : lb.regiStudent();
                        break;
                        case 5 : lb.showStudent();
                        break;
                        case 6 : System.out.println("Enter Student ID number.");
                                 int idd = thl.nextInt();
                                 System.out.println(lb.Find(idd));
                        break;    
                        case 7 : System.out.println(lb.ServeStudent());
                        break;
                    }

                }
                else {
                    System.out.println("Wrong input.");
                }

            } 
            catch (Exception e) {
                 System.out.println("Wrong input.\nTry Again!");
            }
            System.out.println("1. Press y to continue.\n2. Press any other keys to exit");
            ch = thl.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

    }
}
