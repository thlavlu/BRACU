package javaapplication2;

public class ArrayStack implements Stack {

    int size;
    Object[] data;

    public ArrayStack() {
        size = 0;
        data = new Object[5];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object e) throws StackOverflowException {

        if (this.size == this.data.length) {
            throw new StackOverflowException();
        } else {
            data[size] = e;
            size++;
        }
    }

    public Object pop() throws StackUnderflowException {

        if (this.size == this.data.length) {
            throw new StackUnderflowException();
        } else {
            Object temp = data[size - 1];
            data[size - 1] = null;
            size--;

            return temp;
        }
    }

    public Object peek() throws StackUnderflowException {
        if (this.size < 0) {
            throw new StackUnderflowException();
        } else {
            return data[size - 1];
        }
    }

    public String toString() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }

        return "" + size;

    }

    public Object[] toArray() {
Object [] arr=new Object[size];
       for(int i=size-1,j=0;i>=0;i--,j++){
       arr[j]=data[i];
       } return arr;
    }

    public int search(Object e) {
        int index = 0;
        for (int i = size - 1; i <= 0; i--) {

            if (data[i].equals(e)) {
                return index;
            }
             index++;
        }
        return -1;
    }
}
