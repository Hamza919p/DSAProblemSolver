package BinarySearchTree;

import BinaryTree.BinaryTreeNode;

public class BSTMinimumElement {
    int minValue(BinaryTreeNode root) {
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }
}
