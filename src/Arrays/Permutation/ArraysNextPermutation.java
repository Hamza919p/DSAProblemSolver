package Arrays.Permutation;

import java.util.*;

public class ArraysNextPermutation {

    /**
     * NEXT PERMUTATION means we need to return the next computer permutation value of current index
     * 
     ****** BRUTE FORCE BELOW ******
     * Its code complexity is not good.
     * At minimum time complexity would be n! * n (n! means we need factorial and n means no. of elements in an array)
     * i.e [2,1,3]    3! * 3
     * n! means first we need to find all the permutations
     * then we will sort it 
     * then we will search the permutation who's next permutation we need to find
     * then we will return the next permutations
     * **/

    public void find() {
        int num[] = {2,1,3};

        //First we will find All possible permutations
        ArraysFindAllPermutation find = new ArraysFindAllPermutation();
        ArrayList<ArrayList<Integer>> ans = find.permutate(num);

        //Now we will sort all found permutations
        ArraysSortAllPermutation sortAllPermutation = new ArraysSortAllPermutation();
        sortAllPermutation.sort(ans);

        //Now we will search where the given `num` is in the `ans`
        //If found we will return its next permutation value
        //If it is the last value then we will return the first index array value
        
    }





    

    /**
     * Optimal approach will be
     * First iterate from backward and check if (i<i+1)
     * 
     * If we find that i < i+1 then it means sorting is disturbed
     * i.e {1,3,2}    Here 3 is greater then 2 that is OK
     *                but 1 is lesser then 3 so NOT OK
     * 
     * we will swap this current ith index i.e `1` with the last index
     * With last index because, last index will have minimum value and we need to find the next value of ith index
     * that is most close
     * 
     * After swapping we will sort the array to ascending order from i+1;
     * 
     * 
     * **/

    public void findOptimalApproach() {
        int num[] = {1,3,2};

        //find if i < i+1 for backwards
        int i;
        for(i=num.length - 2; i>=0; i--) {
            if(num[i] < num[i+1]) {
                int temp = num[i];
                num[i] = num[num.length-1]; //replace it with last index because last index will contain the minimum value
                num[num.length-1] = temp; // and we need the minimum next value of num[i]
                break;
            } else if(i == 0){
                //means all array is sorted or you can say this is last permutated value
                //so in this case sort the array to ascending as per LEET CODE requirement
                //i.e we have [3,2,1]
                // so return [1,2,3] 
            }   
        }

        //sorting from next of index i
        i++;
        while(i<num.length - 1) {
            if(num[i] > num[i+1]) {
                int temp = num[i];
                num[i] = num[i+1];
                num[i+1] = temp;
            }
            i++;
        }

        //print the next permutation

        for(int j=0; j<num.length; j++) {
            System.out.print(num[j] + " ");
        }
     
    }
}
