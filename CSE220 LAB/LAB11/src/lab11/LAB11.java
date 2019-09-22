// Hi, welcome to my code.
// I am TH Lavlu, a BRACU Student.
// For further, you can contact me
// https://github.com/compboy
//
//
package lab11;

/**
 *
 * @author thlavlu
 */
public class LAB11 {

    public class Node {

        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }

    }

    Node root;

    public Node createTree(Node current, int value) {

        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            current.left = createTree(current.left, value);
        } else if (value > current.value) {
            current.right = createTree(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void addValue(int val) {
        root = createTree(root, val);
    }

    public int heightOfTree(Node n) {

        if (n == null) {
            return 0;
        }

        int leftChild = heightOfTree(n.left);
        int rightChild = heightOfTree(n.right);

        if (leftChild > rightChild) {
            return leftChild + 1;
        } else {
            return rightChild + 1;
        }
        //return Math.max(leftChild, leftChild)+1;

    }

    public int levelOfTree(Node n) {

        if (n == null) {
            return 0;
        }

        int leftChild = heightOfTree(n.left);
        int rightChild = heightOfTree(n.right);

        if (leftChild < rightChild) {
            return leftChild + 1;
        } else {
            return rightChild + 1;
        }
        //return Math.max(leftChild, leftChild)+1;

    }

    public int maxNum(Node n) {
        if (n.right == null) {
            return n.value;
        } else {
            return maxNum(n.right);
        }
    }

    public int minNum(Node n) {
        if (n.left == null) {
            return n.value;
        } else {
            return minNum(n.left);
        }
    }

    public boolean checkSame(Node t1, Node t2) {
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.value == t2.value) {

            return checkSame(t1.left, t2.left) && checkSame(t1.right, t2.right);
        } else {
            return false;
        }
    }

    public void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.value + " ");

        preOrder(n.left);

        preOrder(n.right);

    }

    public void inOrder(Node n) {
        if (n != null) {
            inOrder(n.left);

            System.out.print(n.value + " ");

            inOrder(n.right);

        }
    }

    public void postOrder(Node n) {

        if (n != null) {
            postOrder(n.left);

            postOrder(n.right);

            System.out.print(n.value + " ");

        }
    }

    public static void main(String[] args) {
        LAB11 bt = new LAB11();
        bt.addValue(6);
        bt.addValue(4);
        bt.addValue(8);
        bt.addValue(3);
        bt.addValue(5);
        bt.addValue(7);
        bt.addValue(9);
        LAB11 bt2 = new LAB11();
        bt2.addValue(6);
        bt2.addValue(4);
        bt2.addValue(8);
        bt2.addValue(3);
        bt2.addValue(5);
        bt2.addValue(7);
        bt2.addValue(9);
        System.out.println(bt.checkSame(bt.root, bt2.root));
        System.out.println("Height of a tree: " + bt.heightOfTree(bt.root));
        System.out.println("Level of a tree: " + bt.levelOfTree(bt.root));
        System.out.println("Max number: " + bt.maxNum(bt.root));
        System.out.println("Min number: " + bt.minNum(bt2.root));

        System.out.println("Pre-order Tree.");
        bt.preOrder(bt.root);
        System.out.println();

        System.out.println("In-order Tree.");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.println("Post-order Tree.");
        bt.postOrder(bt.root);
        System.out.println();
    }

}
