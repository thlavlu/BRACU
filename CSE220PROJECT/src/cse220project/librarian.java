// HI, WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package cse220project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author thlavlu
 */
public class librarian {

    Node n = new Node();

    Object book[] = new Object[20];
    public int pos = 1;
    int size = pos-1;
    Scanner thl = new Scanner(System.in);

    public Student regiStudent() {
        Student s = null;
        try {
            System.out.println("Enter Student name :");
            String name = thl.nextLine();
            System.out.println("Enter Student ID :");
            int id = thl.nextInt();
            s = new Student(name, id);
            n.Enqueue(s);
            return s;
        } catch (InputMismatchException e) {
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
        return s;
    }

    public void regiBook() throws FileNotFoundException {
        //Scanner input=new Scanner(new File("bookList.txt"));
        //input.useDelimiter("-|\n");
        Book bk = null;
        System.out.println("Enter book title :");
        String bookTitle = thl.nextLine();
        System.out.println("Enter auther name :");
        String auther = thl.nextLine();
        bk = new Book(bookTitle, auther);
        book[pos] = bk;
        size++ ;
        pos++;
    }

    public void deleteBook() {
        for (int i = 1; i < book.length; i++) {
            if (book[i] == null) {
                continue;
            } else {
                System.out.println(book[i]);
            }
        }
        System.out.println("Enter serial no of book");
        try {
            int bs = thl.nextInt();
            if (bs > 0 && bs < book.length) {
                book[bs] = null;
            } else {
                System.out.println("The book doesn't exist");
            }
        } catch (Exception e) {
            System.out.println("wrong input. ");
        }
    }

    public void ShowBook() {
        for (int i = 1; i < book.length; i++) {
            if (book[i] == null) {
                continue;
            } else {
                System.out.println(book[i]);
            }
        }
    }
    public Student Find(int id)
    {
        if(n.isEmpty()==true)
        {
            System.out.println("None Available");
        }
        else
        {
            for(Node h=n.front; h!=null; h=h.next)
            {
                if(((Student)h.data).getID()==id)
                {
                    return ((Student)h.data);
                }
            }
        }
        return null;
    }

    public void showStudent() {
        if(n.isEmpty()==true)
        {
            System.out.println("None available");
        }
        else
        {
        n.showStudent();
        }
    }

    public String ServeStudent() 
    {
        Student s ;
        Book b;
        String data = null;
        if(n.isEmpty()==true)
        {
             System.out.println("None available");
        }
        else
        {
        s = ((Student)(n.dequeue()).data);
        data = s+" ";
         for (int i = 1; i < book.length; i++)
         {
            if (book[i] == null)
            {
                continue;
            } 
            else 
            {
                System.out.println(book[i]); 
            }
         }
         System.out.println("Enter Serial no of Book");
        try
        {
            int bs = thl.nextInt();
            if (bs > 0 && bs < book.length) 
            {
                b = (Book) book[bs];
                data = data+String.valueOf(b)+" has been served!";
                book[bs] = null;
            } 
            else
            {
                System.out.println("The book doesn't exist");
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("wrong input. ");
        }
        catch (Exception e)
        {
            System.out.println("wrong input. ");
        }
        return data;
    }
       return data;
    }
}
