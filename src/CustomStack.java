import java.util.*;

public class CustomStack {
    
    
    
    /**
     * Implement 2 stacks using 1 array
     * 
     * Approach 1 ->    Half the array. First half is stack 1 and second half is stack 2
     *                  top1 starts from 0 index -> n/2 - 1
     *                  top2 starts from n/2 index -> n - 1
     *                  DISADVANTAGE: Is that if stack 2 is empty and stack1 got full then we will still get
     *                                stack overflow because we cannot access stack 2 space.
     * 
     * Approach 2 ->    Half the array. First half is stack 1 and second half is stack 2
     *                  top1 starts from 0 index
     *                  top 2 starts from n - 1
     *                  Now there will only occure stack overflow if `top1 + 1 == top2`
     *                  So there is no space wasted.
     * 
     * WE WILL FOLLOW APPROACH 2
     * 
     * 
     * **/


    int arr[] = new int[8];
    int top1 = -1;
    int top2 = arr.length;
    public void implement2StacksThrough1Array() {
       

        pushToStack1(1);
        pushToStack1(2);
        pushToStack1(3);
        pushToStack1(4);
        pushToStack1(5);

        pushToStack2(5);
        pushToStack2(4);
        pushToStack2(3);
        pushToStack2(2);

        popFromStack1();
        popFromStack1();
        popFromStack1();
        popFromStack1();

        popFromStack2();
        popFromStack2();
        popFromStack2();
    }

    public void pushToStack1(int x) {
        
        if(top1+1 == top2) {
            System.out.print("Stack 1 overflow");
            return;
        }
        top1++;
        arr[top1] = x;
        
    }

    public void pushToStack2(int x) {
        
        if(top1+1 == top2) {
            System.out.print("Stack 2 overflow");
            System.out.println();
            return;
        }
        top2--;
        arr[top2] = x;
        
    }

    public void popFromStack1() {
        if(top1 < 0) {
            System.out.println("No values found");
            return;
        }
        System.out.println("Stack 1 -> " + arr[top1]);
        top1--;
    }
    public void popFromStack2() {
        if(top2 > arr.length - 1) {
            System.out.println("No values found");
            return;
        }
        System.out.println("Stack 2 -> " + arr[top2]);
        top2++;
    }






















    public void evaluatePostFixExpression() {
        Stack<Integer> s = new Stack();
        String str = "231*+9-";
        
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)) {
                s.push(c - '0');
            } else {
                int secondVal = s.pop();
                int firstVal = s.pop();

                switch(c) {
                    case '+':
                        s.push(firstVal + secondVal);
                        break;
                    case '-':
                        s.push(firstVal - secondVal);
                        break;
                    case '*':
                        s.push(firstVal * secondVal);
                        break;
                    case '/':
                        s.push(firstVal / secondVal);
                        break;
                }

            }
        }

        System.out.println(s.pop());


    }






















  





















  





















  





















    
    public static void main(String args[]) throws Exception {
        CustomStack cs = new CustomStack();
        cs.evaluatePostFixExpression();
    } 

}
