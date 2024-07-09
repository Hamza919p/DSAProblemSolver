package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeSameTree {

//WE WILL USE LEVEL ORDER TRAVERSAL BECAUSE WE NEED TO HANDLE `NULL` too

   public boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            BinaryTreeNode node1 = queue.poll();
            BinaryTreeNode node2 = queue.poll();

            if (node1 == null && node2 == null) {
                continue;
            } else if (node1 == null || node2 == null 
            || node1.data != node2.data) {
                return false;
            }

            queue.add(node1.left);
            queue.add(node2.left);
            queue.add(node1.right);
            queue.add(node2.right);
        }

        return true;

    }

}