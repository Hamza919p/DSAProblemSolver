package Arrays.Permutation;
import java.util.*;

public class ArraysSortAllPermutation {
    public void sort(ArrayList<ArrayList<Integer>> permutation) {
        
        Collections.sort(permutation, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
                int len1 = list1.size();
                int len2 = list2.size();
                int minLen = Math.min(len1, len2);
                
                for (int i = 0; i < minLen; i++) {
                    int cmp = Integer.compare(list1.get(i), list2.get(i)); //this will compare iTh value in array i.e [1,2,3] ith = 1 etc 
                    if (cmp != 0) { //cmp will contain three values. In above comparison if values are 
                        return cmp;
                    }
                }
                return Integer.compare(len1, len2); // if all elements are equal, compare by size
            }
        });
    }    
}
