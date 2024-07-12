package BinarySearchTree;
import java.util.*;

import BinaryTree.BinaryTreeNode;

public class BSTBinaryTreeToBst {
    int i=0;
    public BinaryTreeNode binaryTreeToBST(BinaryTreeNode root)
    {
        List<BinaryTreeNode> list = new ArrayList<BinaryTreeNode>();
        preOrder(root, list);
        Collections.sort(list, Comparator.comparingInt(node -> node.data));
        for(BinaryTreeNode i : list) {
            System.out.print(i.data + " ");
        }
        System.out.println();
        System.out.println();
        int[] index = {0};
        inOrder(root, list, index);
        
    
        return root;
        
    }
    
    public void preOrder(BinaryTreeNode root, List<BinaryTreeNode> l) {
        if(root == null) {
            return;
        }
        l.add(root);
        preOrder(root.left, l);
        preOrder(root.right, l);
        
    }
    
    public void inOrder(BinaryTreeNode root, List<BinaryTreeNode> l, int[] index) {
        if(root == null) {
            return;
        }
        inOrder(root.left, l, index);
        root.data = l.get(index[0]).data;
        index[0]++;
        inOrder(root.right, l, index);
        
    }
}