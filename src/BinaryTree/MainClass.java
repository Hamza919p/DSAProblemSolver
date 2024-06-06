package BinaryTree;

public class MainClass {

    public static void main(String args[]) {
        CustomBinaryTree bt = new CustomBinaryTree();

        int a[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeNode node = bt.createTree(a);
        bt.levelOrderTraversal(node);
        
    }
    
}
