package BinaryTree;

public class BinaryTreeInvert {
    public BinaryTreeNode invertTree(BinaryTreeNode root) {
        if(root == null) {
            return null;
        }
        BinaryTreeNode leftNode = invertTree(root.left);
        BinaryTreeNode rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;
        
        return root; 
    }
}
