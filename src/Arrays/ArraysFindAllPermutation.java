package Arrays;
import java.util.*;

public class ArraysFindAllPermutation {

    /**
     * PERMUTATION means rearrange all values in an array
     * To calculate how much permutation can be made   =>   n!
     * 
    */



    public void permutate() {
        int num[] = {1,2,3}; //who's permutation we need to find
        ArrayList<Integer> ds = new ArrayList<>();   //used to store index wise arrays
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>(); // This will contain all permutations
        boolean visited[] = new boolean[num.length];    //This will check if specific index is visited 
        
        recurPermutation(num, ds, ans, visited);
        for(int i=0; i<ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    public void recurPermutation(int nums[], ArrayList<Integer> ds,  ArrayList<ArrayList<Integer>> ans,  boolean visited[]) {

        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;  //if a specific index is visited, marked it with ture so that next time that index is neglected
                ds.add(nums[i]);
                recurPermutation(nums, ds, ans, visited);
                ds.remove(ds.size() - 1);
                visited[i] = false;
            }
        }
    }
    
}
