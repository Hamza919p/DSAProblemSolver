package BinarySearchTree;
import BinaryTree.BinaryTreeNode;

public class BSTLowestCommonAncestor {

       public BinaryTreeNode lowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q) {
        if(root == null) {
            return null;
        }

        if(p.data  < root.data && q.data  < root.data) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if(p.data  > root.data && q.data  > root.data) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}