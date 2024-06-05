package StackAndQueue;
import java.util.*;

public class ReverseFirstKElements {
    public void reverse(int k) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        int i = 0;

        while(i < k) {
            s.push(q.poll());    //1,2,3
            i++;
        }

        while(!s.isEmpty()) {
            q.add(s.pop());  //4,5,3,2,1
        }

        i = 0;
        while(i < q.size() - k) {
            int val = q.poll();
            q.add(val);         //3,2,1,4,5
            i++;
        }

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
