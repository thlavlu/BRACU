package lab07;

import java.util.Scanner;
import java.util.Stack;

public class LAB07 {
    public static boolean check() {

         Stack<Integer> stack = new Stack<Integer>();
          Scanner in = new Scanner(System.in);
        String newExp = in.next();
        String[] exp = new String[newExp.length()];
        for (int i = 0; i < exp.length; i++) {

            char ch = newExp.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(i);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                //nothing to match with
                if (stack.isEmpty()) {
                    System.out.println("YES");
                    return false;
                } else if (stack.pop() != ch) {
                      System.out.println("No");
                    return false;
                }

            }
        }
        if (stack.isEmpty()) {
           System.out.println("YES");
            return true;
            
        } else {
            System.out.println("No");
            return false;
        }

    }


    public static void main(String[] args) {
  check();

   
}
}
