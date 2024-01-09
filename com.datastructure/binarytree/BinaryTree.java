package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data; // Can be any generic type

        public TreeNode(int data) {
            this.data = data;
        }
    }

    //Recursive Pre-Order Transversal
    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Recursive In-Order transversal
    public void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Recursive Post-Order Transversal
    public void postOrder(TreeNode root) {
        if(root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    //Iterative Pre-Order transversal
    public void preOrderIterative() {
        if(root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
        System.out.println();
    }


    //Iterative In-Order transversal
    public void inOrderIterative() {
        if(root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    //Level-Order Transversal
    public void levelOrder() {
        if(root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                queue.offer(temp.left);
            }
            if(temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }


    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root ---> first
        first.left = second;
        first.right = third; // second <--- root ---> third

        second.left = fourth;
        second.right = fifth;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.println("Recursive Pre-Order Transversal");
        bt.createBinaryTree();
        bt.preOrder(bt.root);
        System.out.println();

        System.out.println("Iterative Pre-Order Transversal");
        bt.preOrderIterative();

        System.out.println("Recursive In-Order Transversal");
        bt.inOrder(bt.root);
        System.out.println();

        System.out.println("Iterative In-Order Transversal");
        bt.inOrderIterative();
        System.out.println();

        System.out.println("Recursive Post-Order Transversal");
        bt.postOrder(bt.root);
        System.out.println();

        System.out.println("Level Order Transversal");
        bt.levelOrder();
    }
}
