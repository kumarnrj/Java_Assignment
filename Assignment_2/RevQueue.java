package com.Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RevQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(12);
        queue.add(34);
        queue.add(54);
        queue.add(87);

        System.out.println("The elements of the queue are:");
        System.out.println(queue);

        System.out.println("The elemets of the queue in reverse order");
        Stack<Integer> st = new Stack<>();

        while(!queue.isEmpty()){
            int val =queue.peek();
            queue.remove();
            st.push(val);
        }
       
        while(!st.empty()){
            System.out.print(st.pop()+" ");
        }
    }


}
