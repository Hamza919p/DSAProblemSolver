package BinaryTree;

import java.util.*;

public class BinaryTreePrintZigZag {
    public void print(BinaryTreeNode node) {

        List<List<Integer>> l = new ArrayList<>();
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(node);

        boolean flag = false;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode curr = q.poll();
                if (flag) {
                    s.push(curr.data);
                } else {
                    level.add(curr.data);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            flag = !flag;

            while (!s.isEmpty()) {
                level.add(s.pop());
            }

            l.add(level);

        }

        //print
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j) + " ");
            }
        }

    }
}
