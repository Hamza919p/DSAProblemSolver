package Arrays.MissingNumber;

public class MissingNumber {
    /**
     * Missing number means you need to find a missing number between range [0,n] or [1,n]
     * Below conditions are given every time when going to solve this problem
     * 1. There will be no repeating numbers
     * 2. There will occure in a consective manner
     * 
     * 
     * 
     * First approach is to check values from 0 - array.length in the the array
     * for example check if 0 is present in the given array
     * RETURN The value that is missing in array
     * time complexity => O(N)^2
     * 
     * 
     * 
     * 
     * Second approach is to find `summation` that has a formula (n * n+1)/2
     * summation/sigma returns a value that is equal to the sum of all values if missing number is present
     * 
     * After finding summation, simply substract the value with index. You will get some remainder. now substract that
     * remainder with next value and keep on doing this until last index reached
     * 
     * Time complexity => o(n)
     * 
     * **/

     public void findWithSummation(int a[]){
        int n = a.length; 
        int summation = (n * (n+1))/2;

        int substractedValue = summation;
        for(int i=0; i<a.length; i++) {
            substractedValue = substractedValue - a[i];
        }

        System.out.println(substractedValue);
     } 


     /**
      * Sometimes interviewer may ask you some other way.  
        XOR has a sign of + with a circle aroung

        XOR has properties
        1. a XOR a = 0      means if XOR is done with the same value result is always 0
        2. a XOR 0 = a      means if XOR is done with the 0 then result is always value
        3. a XOR b = b XOR a    it is a commutative sum
      
        Approach will be to find XOR with index values upto the range
        Then we will find XOR of given array with the result we finded before i.e XOR with range
        The remaining non zero value will be our missing value

      */

      public void findWithXOR(int a[]) {
        int XOR = 0;

        //find XOR for all indexes. it is XOR of indexes
        for(int i=0; i<=a.length; i++) {
            XOR = XOR ^ i;
            //XOR will return the value from bitwise table i.e 0000 ^ 0000 = 0
            //                                                 0000 ^ 0001 = 1 because 0001 => 1                 
        }

        for(int i=0; i<a.length; i++) {
            XOR = XOR ^ a[i];
        }
    
        // System.out.println(XOR);

      }

}
