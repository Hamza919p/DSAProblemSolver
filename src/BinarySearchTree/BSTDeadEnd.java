package BinarySearchTree;

import BinaryTree.BinaryTreeNode;

class BSTDeadEnd {

    //IMPORTANT:::::
    //Dead end is always found at leaf node.
    //So we will check range of left and right node.
    //if at the left node `left node value and right node value matched then there is leaf node`


    public static boolean isDeadEnd(BinaryTreeNode root) {
        
        return solve(root, 1, Integer.MAX_VALUE);
    }

    public static boolean solve(BinaryTreeNode root, int min, int max) {
        if (root == null)
            return false;
        if (min == max) //these are range
            return true;
        //this will tell that left node range is from [infinity, node_value - 1]
        boolean left = solve(root.left, min, root.data - 1);
        //this will tell that right node range is from [node_value + 1, infinity]
        boolean right = solve(root.right, root.data + 1, max);
        return left || right;
    }
}