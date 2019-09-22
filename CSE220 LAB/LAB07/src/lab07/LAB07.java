package lab07;

import java.util.Scanner;
import java.util.Stack;

public class LAB07 {

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        int size = 10;
        char[] a = new char[100];
        System.out.println("Enter An Arithmetic Expression.");
        String input = thl.next();
        for (char c : input.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                a[size] = c;
                size++;
            } else if (c == ')' || c == '}' || c == ']') {
                char temp = a[size];
                a[size - 1] = 0;
                size--;

            }

        }
        if (size == 10) {
            System.out.println("This expression is NOT correct.");
        } else {
            System.out.println("This expression is correct.");
        }
    }
}
