package BinaryTree;

public class BinaryTreeIsSubTree {

    /**
     * 
     * USE any one `preorder, inorder, postorder`
     * 
     * **/
    public boolean isSubtree(BinaryTreeNode root, BinaryTreeNode subRoot) {
        String a = preOrderTraversal(root);
        String b = preOrderTraversal(subRoot);
        if (a.contains(b)) {
            return true;
        } else {
            return false;
        }
    }

    public String preOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.data);
        sb.append(preOrderTraversal(root.left));
        sb.append(preOrderTraversal(root.right));

        return sb.toString();
    }
}
