// HI, WELCOME TO MY PROGRAM.
// I AM THLAVLU, A BRACU STUDENT.
// FOR FURTHURE, YOU CAN FIND ME..
// https://github.com/compboy
// (-:)
//
package lab08v2;

/**
 *
 * @author thlavlu
 */
public class Queuedata {

    Object[] qArray = new Object[20];
    int size;
    int front = 0;
    int rear = -1;

    public int size() {

        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Object p) throws QueueOverflowException {
        if (size == qArray.length) {
            throw new QueueOverflowException();
        } else {
            qArray[(rear + 1) % qArray.length] = p;
            rear++;
            size++;
        }
    }

    public Object Dequeue() throws QueueUnderflowException {
        if (isEmpty() == true) {
            throw new QueueUnderflowException();
        } else {
            Object p = qArray[front % qArray.length];
            front++;
            size--;
            return p;
        }
    }

    public Object peek() throws QueueUnderflowException {
        if (isEmpty() == true) {
            throw new QueueUnderflowException();
        } else {
            return qArray[front % qArray.length];
        }
    }

    public Object pop() throws QueueUnderflowException {
        if (isEmpty() == true) {
            throw new QueueUnderflowException();
        } else {
            return Dequeue();
        }
    }

    public String toString() {
        if (isEmpty() == true) {
            return null;
        } else {
            String patientData = "";
            for (int start = front; start < front + size; start++) {
                patientData = "[ " + String.valueOf(qArray[start % qArray.length]);
            }
            patientData = patientData + " ]";
            return patientData;
        }
    }

    public void ClearAll() throws QueueUnderflowException {
        while (isEmpty() == false) {
            Dequeue();
        }
    }

}
