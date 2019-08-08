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
public class Node {

    Object data;
    Node next;
    Node front;
    Node rear;
public Node(){

}
    public Node(Object data, Node node) {
        this.data = data;
        this.next = node;
        
    }

    public void Enqueue(Student data) {
        Node temp;
        Node newNode = new Node(data, null);
        temp = newNode;
       // temp.next = null;

        if (front == null && rear==null) {
            front =rear=temp;
            //rear.next=null;
        }
        else{
        rear.next = temp;
        rear = temp;
       // rear.next=null;
        }
    }
    public Node dequeue() {
        Node temp = front;
        if (front == null) {
            return null;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        return temp;

    }

    public void showStudent() {
        for (Node n = front; n!=null; n = n.next) {
            System.out.println(n.data);
        }
    }

    public boolean isEmpty() {
        if (front == null && rear == null) {
            return true;
        }
        return false;

    }

}


