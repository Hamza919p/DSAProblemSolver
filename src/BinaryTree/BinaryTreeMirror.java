package BinaryTree;

public class BinaryTreeMirror {
    public void make(BinaryTreeNode node) {
        if(node == null) {
            return;
        }
        make(node.left);
        make(node.right);

        BinaryTreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
