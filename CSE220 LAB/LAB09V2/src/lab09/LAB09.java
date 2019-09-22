// Created by THLLavlu
package lab09;
public class LAB09 {

    public static Node head;

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int printArray(int[] a, int index) {
        if (index != -1) {
            printArray(a, index - 1);
            System.out.print(a[index] + " ");
        }
        return 0;
    }

    public static int bin(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 2 + 10 * bin(n / 2);
        }
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * power(x, y - 1);
        }
    }

    public static void printLinked(Node h) {
        if (h.next == null) {
            System.out.print(h.element);
        } else {
            System.out.print(h.element + " ");
            printLinked(h.next);

        }

    }

    public static void printLinkedRev(Node h) {
        if (h == null) {
            return;
        } else {
            printLinkedRev(h.next);
            System.out.print(h.element + " ");

        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fib(3));
        int[] a = new int[]{10, 20, 30, 40, 50};
        printArray(a, a.length - 1);
        System.out.println();
        System.out.println(bin(16));
        System.out.println(power(30, 2));
        // public void LinkedList(int[] ar) {
        Node n = new Node(a[0], null);
        head = n;
        for (int i = 1; i < a.length; i++) {
            Node node = new Node(a[i], null);
            n.next = node;
            n = node;
        }
        printLinked(head);
        System.out.println();
        printLinkedRev(head);
    }
}
