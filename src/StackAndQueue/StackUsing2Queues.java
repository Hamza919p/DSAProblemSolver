package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
/**
     * AS queue means FIFO so it will never reverse something.
     * To achieve this reverse using FIFO we can use 2 queues
     * 
     * 
     * **/
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void stackUsing2Queues(int x) {
        if(!q1.isEmpty()) {
            while(!q1.isEmpty()) {
                int val = q1.poll();
                q2.add(val);
            }
            q1.add(x);
            while(!q2.isEmpty()) {
               q1.add(q2.poll());     
            }
        } else {
            q1.add(x);
        }
    }

    public void popQueue() {
        while(!q1.isEmpty()) {
            System.out.println(q1.poll());
        }
    }

}
