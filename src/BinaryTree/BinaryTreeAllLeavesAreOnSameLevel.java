package BinaryTree;

public class BinaryTreeAllLeavesAreOnSameLevel {

    int levelOfLeaf = 0;

    public boolean check(BinaryTreeNode node, int level) {
        if (node == null) {
            return true;
        }

        if (node.left == null && node.right == null) {
            if(levelOfLeaf == 0) {
                levelOfLeaf = level;
                return true;
            }

            return levelOfLeaf == level;

        }

        return check(node.left, level + 1) && check(node.right, level + 1);
    }
}
