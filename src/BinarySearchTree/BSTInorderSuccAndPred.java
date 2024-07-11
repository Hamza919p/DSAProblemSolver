package BinarySearchTree;

import BinaryTree.BinaryTreeNode;

public class BSTInorderSuccAndPred {
    public static void findPreSuc(BinaryTreeNode root, BinaryTreeNode[] pre, BinaryTreeNode[] suc, int key) {
        // Find the node with the given key
        BinaryTreeNode parentNodeForSuccessor = null;
        BinaryTreeNode parentNodeForPredessor = null;
        
        // Traverse the tree to find the node with the given key
        while (root != null && root.data != key) {
          
            if (root.data < key) {
                parentNodeForPredessor = root;
                root = root.right;
            } else {
                parentNodeForSuccessor = root;
                root = root.left;
            }
            
        }
        
        // If the node is not found, return
        if (root == null) {
            return;
        }

        // For inorder successor
        BinaryTreeNode successor = findSuccessor(root.right);
        if (successor == null) {
            suc[0] = parentNodeForSuccessor;
        } else {
            suc[0] = successor;
        }
        
        // For inorder predecessor
        BinaryTreeNode predessor = findPredessor(root.left);
        if (predessor == null) {
            pre[0] = parentNodeForPredessor;
        } else {
            pre[0] = predessor;
        }
    }
    
    public static BinaryTreeNode findSuccessor(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    public static BinaryTreeNode findPredessor(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
}
