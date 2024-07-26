package Arrays.ReaptingNumber;

public class RepeatingNumber {
    
    /**
     * ===(One of the approach)===== is make an array of boolean with N size
     * When a specific value is iterated, make it T.
     * Also check if the current value boolean is true. If true then print that as a repeating number
        
     * **/

     public void find() {
        int a[] = {1,2,3,4,4};
        boolean check[] = new boolean[a.length + 1];

        for(int i=0; i<a.length;i++) {
            if(!check[a[i]]) {
                check[a[i]] = true;
            } else {
                System.out.println("Repeating number is => " + a[i]);
            }

        }
        
    }


}
