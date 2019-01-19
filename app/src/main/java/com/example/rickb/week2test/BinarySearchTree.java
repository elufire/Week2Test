package com.example.rickb.week2test;

public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }


    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }


    Node insertRec(Node root, int key) {


        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);


        return root;
    }

    void preorder()  {
        preorderFunc(root);
    }

    void preorderFunc(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preorderFunc(root.left);
            preorderFunc(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(55);
        tree.insert(16);
        tree.insert(96);
        tree.insert(88);
        tree.insert(14);
        tree.insert(78);
        tree.insert(80);
        tree.insert(77);
        tree.preorder();
    }
}


