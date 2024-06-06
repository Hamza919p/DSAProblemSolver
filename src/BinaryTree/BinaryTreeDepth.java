package BinaryTree;

public class BinaryTreeDepth {
    
    public int findDepth(BinaryTreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftDepth = findDepth(root.left);
        int rightDepth = findDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;

    }

}
