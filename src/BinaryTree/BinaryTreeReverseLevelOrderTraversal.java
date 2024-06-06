package BinaryTree;

import java.util.*;

public class BinaryTreeReverseLevelOrderTraversal {

    public void reverse(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        Stack<BinaryTreeNode> s = new Stack<>();

        q.add(root);

        while (!q.isEmpty()) {
            BinaryTreeNode curr = q.poll();
            if (curr.right != null) {
                q.add(curr.right);
            }

            if (curr.left != null) {
                q.add(curr.left);
            }

            s.push(curr);

        }

        while (!s.isEmpty()) {
            System.out.print(s.pop().data + " ");
        }

    }

}
