package BinaryTree;

/**
 * Two trees are isomorphic if 
 * 1. There current node data is same
 * 2. Either current node left node value matches to left node of other tree
 * 3. Either current node left node value matches to right node of other tree
 * 4. Empty tree is also isomorphic
 * 5. Same goes for right node
 * **/

public class BinaryTreeIsomorphic {
    
    public boolean isIsomorphic(BinaryTreeNode t1, BinaryTreeNode t2) {
        if(t1 == null && t2 == null) {
            return true;
        }

        if(t1 == null || t2 == null) {
            return false;
        }

        if(t2.data != t2.data) {
            return false;
        }

        return (
             isIsomorphic(t1.left, t2.left) && isIsomorphic(t1.right, t2.right)
                        ||
             isIsomorphic(t1.left, t2.right) && isIsomorphic(t1.right, t2.left)   
        );
    }

}
