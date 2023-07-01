package zerooneseven;

/* This is question to find out the minimum path to reach the destination.*/

import java.util.*;
public class s1 {
    static class Node
    {
        int data;
        Node left;
        Node right;
    };


    static Node newNode(int data)
    {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;

        return (node);
    }
    static int result;
    static int minpath(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return root.data;

        int ls = minpath(root.left);
        int rs = minpath(root.right);

        if (root.left != null && root.right != null)
        {

            result = Math.min(result, ls + rs + root.data);

            return Math.min(ls + root.data, rs + root.data);
        }


        if (root.left == null)
            return rs + root.data;
        else
            return ls + root.data;
    }


    static int minPathSum( Node root)
    {
        result = Integer.MAX_VALUE;
        minpath(root);
        return result;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Node root= newNode(7);
        root.left= newNode(6);
        root.left.left= newNode(3);
        root.left.left.left= newNode(-3);
        root.left.left.right= newNode(4);
        root.right= newNode(8);
        root.right.right= newNode(10);
        root.right.right.right= newNode(11);
        root.right.right.left= newNode(9);
        System.out.println(minPathSum(root.left.left));

    }
}
