package BinaryTree;

import java.util.*;

public class BinaryTreeLeftView {
    public void print(BinaryTreeNode node, int level, ArrayList<BinaryTreeNode> list) {

        if (node == null) {
            return;
        }

        try {
            if(list.get(level) == null) {
                list.add(node);
            }

        }catch(IndexOutOfBoundsException e) {
            list.add(node);
        }

        print(node.left, level+1, list);
        print(node.right, level+1, list);

    }

}
