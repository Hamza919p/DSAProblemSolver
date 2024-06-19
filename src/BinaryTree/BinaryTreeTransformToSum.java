package BinaryTree;

public class BinaryTreeTransformToSum {
    public void toSumTree(BinaryTreeNode root){
        findSum(root);
    }
    
    public int findSum(BinaryTreeNode root) {
        if(root == null) {
            return 0;
        }
        int val = root.data;
        int leftSum = findSum(root.left);
        int rightSum = findSum(root.right);
        root.data = leftSum + rightSum;
        return leftSum + rightSum + val;
    }
    
}
