package BinaryTree;

public class BinaryTreeHeightBalancedCheck {
    public int check(BinaryTreeNode node) {
        if(node == null) {
            return 0;
        }
        int lh = check(node.left);
        int rh = check(node.right);

        //below 2 functions will check if tree is balanced or not
        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh-rh) > 1) return -1;

        //this will check height
        return Math.max(lh, rh) + 1;

    }
}
