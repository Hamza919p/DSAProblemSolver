package StackAndQueue;

import java.util.*;

public class ReverseAQueue {
    public void reverseAQueue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> s = new Stack<>();
        
        while(!q.isEmpty()) {
            s.push(q.poll());
        }

        while(!s.isEmpty()) {
            q.add(s.pop());
        }

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
