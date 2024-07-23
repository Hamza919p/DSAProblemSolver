package BinaryTree;

import Arrays.Permutation.ArraysFindAllPermutation;
import Arrays.Permutation.ArraysNextPermutation;
import BinarySearchTree.BSTBinaryTreeToBst;

public class MainClass {

    public static void main(String args[]) {
        CustomBinaryTree bt = new CustomBinaryTree();

        int a[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        ArraysNextPermutation nextPermutation = new ArraysNextPermutation();
        nextPermutation.findOptimalApproach();

    }
    
}
