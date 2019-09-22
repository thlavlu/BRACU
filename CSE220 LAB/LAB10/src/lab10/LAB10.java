// Hi, welcome to my code.
// I am TH Lavlu, a BRACU Student.
// For further, you can contact me
// https://github.com/compboy
//
//
package lab10;

import java.util.Scanner;

public class LAB10 {
    /**
     *
     * @author thlavlu
     */
    public static long fibArray[] = new long[150];
    public static Node head;

    public static void swap(int[] a, int max, int min) {
        int temp = a[max];
        a[max] = a[min];
        a[min] = temp;

    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    swap(a, j, i);
                }
            }
        }

    }

    static void insertionSort(int arr[], int n) {
        if (n <= 1) {
            return;
        }

        insertionSort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void linkedListBubbleSort(Node h) {
        for (Node n = h; n != null; n = n.next) {

            for (Node m = head; m.next != null; m = m.next) {
                int temp = 0;
                if (m.elem > m.next.elem) {
                    temp = m.elem;
                    m.elem = m.next.elem;
                    m.next.elem = temp;

                }

            }

        }
    }

    public static Node linkedListSelectionSort(Node h) {
        for (Node n = h; n != null; n = n.next) {
            for (Node m = n.next; m != null; m = m.next) {
                if (n.elem > m.elem) {
                    int temp = n.elem;
                    n.elem = m.elem;
                    m.elem = temp;
                }
            }
        }
        return h;
    }

    public static Node doublyLinkedListInsertionSort(Node h) {//hoynay
        Node current = null, index = null;
        int temp;
        if (head == null) {
            return head;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.elem > index.elem) {
                        temp = current.elem;
                        current.elem = index.elem;
                        index.elem = temp;
                    }
                }
            }
        }
        return head;
    }
 
    public static int binarySearch(int search, int[] array, int start, int end) {

        int middle = (start + end) / 2;

        if (end < start) {
            return -1;
        }

        if (search < array[middle]) {
            return binarySearch(search, array, start, middle - 1);
        }

        if (search > array[middle]) {
            return binarySearch(search, array, middle + 1, end);
        }

        if (search == array[middle]) {
            return middle;
        }

        return -1;
    }

    public static long fibonacci(long n) {
        long fibValue = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibArray[(int) n] != 0) {
            return fibArray[(int) n];
        } else {
            fibValue = fibonacci(n - 1) + fibonacci(n - 2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }

    public static Node createLinkedList(int[] a) {
        Node n = new Node(a[0], null);
        head = n;
        for (int i = 1; i < a.length; i++) {
            Node temp = new Node(a[i], null);
            n.next = temp;
            n = temp;
        }
        return head;
    }

    public static Node createDoublyLinkedList(int a[]) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < a.length; i++) {
            Node n = new Node(a[i]);
            if (head == null) {
                head = n;
                tail = n;
                head.prev = n;
                tail.next = null;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
                tail.next = null;

            }

        }
        return head;

    }

    public static void printLinkedList(Node h) {

        for (Node n = h; n != null; n = n.next) {
            System.out.print(n.elem + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner thl = new Scanner(System.in);
        int a1[] = new int[]{30, 50, 10, 80, 20, 60, 70, 40};
        System.out.println("Before sorting.");
        printArray(a1);
        selectionSort(a1);
        System.out.println("After selection sorting.");
        printArray(a1);
        System.out.println("\n");

        System.out.println("Before sorting.");
        int a2[] = new int[]{3, 5, 1, 8, 2, 6, 7, 4};
        printArray(a2);
        insertionSort(a2, a2.length);
        System.out.println("After Linked List inesertion sorting.");
        printArray(a2);

        System.out.println("\n");
        int a3[] = new int[]{300, 500, 100, 800, 200, 600, 700, 400};
        Node head = createLinkedList(a3);
        System.out.println("Before sorting.");
        printLinkedList(head);
        linkedListBubbleSort(head);
        System.out.println("After bubble sorting.");
        printLinkedList(head);

        System.out.print("\n");
        int a4[] = new int[]{5, 15, 10, 40, 20, 30, 35, 25};
        System.out.print("Before sorting.");
        Node head2 = createLinkedList(a4);
        printLinkedList(head2);
        linkedListSelectionSort(head2);
        System.out.print("After LinkedList selection sorting.");
        printLinkedList(head2);
      
        System.out.println("\n");
        int a5[] = new int[]{5, 15, 10, 40, 20, 30, 35, 25};
        System.out.println("Before doubly insertion sorting.");
        Node head4 = createDoublyLinkedList(a4);
        printLinkedList(head4);
        Node h5 = doublyLinkedListInsertionSort(head4);
       System.out.println("After doubly linkedlist insertion sorting.");
        printLinkedList(head2);
        
        System.out.println("\n");
        System.out.print("Binary searching.");
        int a6[] = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Enter searchin index");
        int s=thl.nextInt();
        System.out.print("Index no " + binarySearch(s, a6, 0, a5.length));

        System.out.println("\n");
        
        System.out.println("Enter number for Fibonacci: ");
        int n = thl.nextInt();
        fibArray[0] = 1;
        fibArray[1] = 1;
        System.out.println("Value of Nth number in Fibonacci series: " + fibonacci(n));
    }

}