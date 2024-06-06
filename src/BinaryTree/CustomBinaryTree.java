package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree {

    int indx = -1;
    public BinaryTreeNode createTree(int arr[]) {
        indx++;
        
        if(arr[indx] == -1) {
            return null;
        }
        BinaryTreeNode node = new BinaryTreeNode(arr[indx]);
        node.left = createTree(arr);
        node.right = createTree(arr);
        
        return node;
    }

    public void levelOrderTraversal(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            BinaryTreeNode curr = q.poll();
            if(curr == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(curr.data);
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }

            }
        }
    }

}
