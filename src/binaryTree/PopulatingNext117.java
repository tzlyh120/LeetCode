package binaryTree;

import java.net.ConnectException;

/**
 * @author Yihan
 * @date 9/19/2023 - 4:24 PM
 */
public class PopulatingNext117 {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node head = root;
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.right = new Node(7);
        root = connect(root);
    }
    public static Node connect(Node root) {
        Node result = root;
        while(root!=null){
            Node head= new Node(0);
            Node cur = head;
            while(root!=null){
                if(root.left!=null){cur.next=root.left; cur=cur.next;}
                if(root.right!=null){cur.next = root.right; cur=cur.next;}
                root = root.next;
            }
            root = head.next;
        }
        return result;

    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

