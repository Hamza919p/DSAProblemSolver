package BinaryTree;

import Arrays.MissingNumber.MissingNumber;
import Arrays.Permutation.ArraysFindAllPermutation;
import Arrays.Permutation.ArraysNextPermutation;
import BinarySearchTree.BSTBinaryTreeToBst;

public class MainClass {

    public static void main(String args[]) {
        CustomBinaryTree bt = new CustomBinaryTree();

        int treeData[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        MissingNumber number = new MissingNumber();
        int a[] = {0,1,2,3,5};
        number.findWithXOR(a);

    }
    
}
