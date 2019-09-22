package linklistlab04;

public class LinkedList {

    public Node head;

    /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        Node n = new Node(a[0], null);
        head = n;
        for (int i = 1; i < a.length; i++) {
            Node node = new Node(a[i], null);
            n.next = node;
            n = node;

        }
    }

    /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
     */
    public LinkedList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
        }
        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList() {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(" " + n.element);
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
        Node n = head;

        for (int i = 0; i < idx; i++, n = n.next) {
        }
        return n;
    }

// returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        //int i = 0;
        Node n = head;
        for (int i = 0; i <= idx; i++, n = n.next) {
            if (i == idx) {
                return n.element;
            }

        }
        return null;

//        Node node = nodeAt(idx);
//        if (node == null) {
//            return null;
//        } else {
//            return node.element;
//        }
    }

    /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
       int size=countNode();
        if (idx>size){
        return null;
        }
       Node node= nodeAt(idx);
        Object oldElem=node.element;
       node.element=elem;
    return oldElem;
    }
    /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
       int i=0;
        for(Node n=head;n!=null;n=n.next,i++){
        if(n.element==elem){
        return i;
        }
        }
        return -1; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
     for(Node n=head;n!=null;n=n.next){
        if(n.element==elem){
        return true;
        }
     }
        return false; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
       Node copyH=null;
       Node copyT=null;
       for(Node n=head;n!=null;n=n.next){
       Node newH= new Node(n.element,null);
       
       if(copyH==null){
       copyH=newH;
       copyT=copyH;
       
       }
       else{
       copyT.next=newH;
      copyT=copyT.next;
       }
        
    }
       return copyH; 
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        Node newH=null;
        for(Node n=head;n!=null;n=n.next){
        Node temp=new Node(n.element,null);
        temp.next=newH;
        newH=temp;
        }
        return newH                             ; // please remove this line!
    }

    public void insert(Object elem, int idx) {
        Node n=new Node(elem, null);
        if(head==null){
        n.next=head;
        head=n;
        }
        else{
        Node pred=nodeAt(idx-1);
        n.next=pred.next;
        pred.next=n;
        }
    }

    /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
       Node n = nodeAt(index);
       Object old=n.element;
      Node current=head;
      Node parent=null;
      int i=0;
      while(i<index){
      parent=current;
      current=current.next;
      i++;
      }
      if(current!=null && parent==null){
      head=current.next;
      }
      else{
      parent.next=current.next;
      }
        
        return old; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        // TO DO
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        // TO DO
    }

}
