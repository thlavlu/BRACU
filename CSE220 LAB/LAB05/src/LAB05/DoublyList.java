package LAB05;

import java.util.*;

public class DoublyList {

    public Node head;

    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList(Object[] a) {
        head = new Node(null, null, null);
        Node tail = head;

        for (int i = 0; i < a.length; i++) {
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev = tail;
            tail = tail.next;
        }
        tail.next = head; // Making it circular
        head.prev = tail;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int count = 0;
        for (Node n = head.next; n != head; n = n.next) {
            count++;

        }

        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void forwardprint() {
        for (Node f = head.next; f != head; f = f.next) {
            System.out.print(f.element + " ");
        }
        System.out.println();
    }

    public void backwardprint() {
        for (Node b = head.prev; b != head; b = b.prev) {
            System.out.print(b.element + " ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        if (idx < 0) {
            return null;
        }
        Node n = head.next;
        for (int i = 0; i < idx; i++) {
            n = n.next;
        }

        return n; // please remove this line!
    }

    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        int count = 0;
        int idx = 0;
        for (Node f = head.next; f != head; f = f.next, idx++) {
            if (elem == f.element) {
                return idx;
            }

        }

        return -1; // please remove this line!

    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        Node tail = null;
        Node n = new Node(elem, null, null);
        if (idx == 0) {
            n.next = head.next;
            tail = n.next;
            head.next = n;
            tail.prev = n;
            n.prev = head;

        } else {
            Node pred = nodeAt(idx - 1);
            n.next = pred.next;
            pred.next = n;
            tail=n.next;
            tail.prev = n;
            n.prev = pred;
        }
    }

    public Object remove(int index) {
        Node n = nodeAt(index);
        Object old = n.element;
        Node current = head.next;
        Node parent = null;
        int i = 0;
        while (i < index) {
            parent = current;
            current = current.next;
            i++;
        }
        if (current != null && parent == null) {
            head.next = current.next;
            current.next.prev=head;
        } else {
            parent.next = current.next;
            parent.next.prev=parent;
        }
        return old;
    }
}
