package com.proftelran.org.lessonthirteenth;

public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(1, "node 1");
        binaryTree.insert(2, "node 2");
        binaryTree.insert(3, "node 3");
        binaryTree.insert(5, "node 5");
        binaryTree.insert(4, "node 4");


        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTree.insert(3, "node 3");
        binaryTree.insert(2, "node 2");
        binaryTree.insert(1, "node 3");
        binaryTree.insert(4, "node 4");
        binaryTree.insert(5, "node 5");
    }
}
