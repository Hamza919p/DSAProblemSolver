package StackAndQueue;

import java.util.Stack;

public class PostFixEvaluation {
 /**
     * 231*+9-
     * 
     * Push operand until operator comes
     * If operator comes, pop above 2 values and do operation.
     * and then again push that value to the stack
     * 
     * **/

    public void evaluatePostFixExpression() {
        Stack<Integer> s = new Stack<>();
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
}
