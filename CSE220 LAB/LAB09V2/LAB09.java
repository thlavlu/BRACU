//Created by THLAVLU
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

    public static int fib(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (n == 2) {
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
            System.out.print(h.element+" ");
        } else {

            printLinked(h.next);
            System.out.print(h.element + " ");
        }
    }

    public static void printLinkedRev(Node h) {
        if (h == null) {
            return;
        } else {
            System.out.print(h.element + " ");
            printLinkedRev(h.next);

        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fib(10));
        int[] a = new int[]{10, 20, 30, 40, 50};
        printArray(a, a.length - 1);
        System.out.println();
        System.out.println(bin(120));
        System.out.println(power(30, 2));
        
        // public void LinkedList(int[] ar) {
//        Node n = new Node(a[0], null);
//        head = n;
//        for (int i = 1; i < a.length; i++) {
//            Node node = new Node(a[i], null);
//            n.next = node;
//            n = node;
//        }
//Node a0=new Node(0,null);

        Node a1 = new Node(10, null);
        Node a2 = new Node(20, a1);
        Node a3 = new Node(30, a2);
        Node a4 = new Node(40, a3);
        Node a5 = new Node(50, a4);

        head = a5;
        printLinked(head);
        System.out.println();
        printLinkedRev(head);
    }
}
