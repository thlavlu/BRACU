package lab01t01;
//Hi am Tousif Hasan Lavlu.
//Department of computer science and engineering.
//BRAC University.

import java.util.*;

public class lab01t01 {

    public static void main(String[] args) {
                Long startTime = System.currentTimeMillis();
        Stack s = new Stack();
        System.out.println("Pushing " + s.push(10));
        System.out.println("Printing top " + s.peek());
        s.pop();
        System.out.println("Pushing " + s.push(5));
        System.out.println("Printing top " + s.peek());
        s.pop();
        System.out.println("Pushing " + s.push(6));
        System.out.println("Printing top " + s.peek());
        s.pop();
        System.out.println("Pushing " + s.push(9));
        System.out.println("Printing top " + s.peek());
        s.pop();
        System.out.println("Pushing " + s.push(3));
        System.out.println("Printing top " + s.peek());
        s.pop();
        System.out.println("Pushing " + s.push(2));
        System.out.println("Printing top " + s.peek());
        s.pop();

        Long endTime = System.currentTimeMillis();
        System.out.println("Run time in milli second: "+(endTime-startTime));
    }
}
