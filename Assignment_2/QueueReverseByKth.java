package com.Assignment_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverseByKth {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        System.out.println("The elements of the queue are:");
        System.out.println(queue);


        // sorting the queue by kth position
        int k = 6;
        sortQueueByK(queue,k);

    }

    private static void sortQueueByK(Queue<Integer> queue, int k) {
        // creating a temporary stack which will store the element till k fron the queue
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<k;i++){
            int n = queue.peek();
            queue.remove();
            stack.push(n);
        }

        // adding the reversed k element in the queue
       for(int i=0;i<k;i++){
           queue.add(stack.pop());
       }


       // removing the remaining element from the queue and again adding them at the end of the queue
       for(int i=0;i<queue.size()-k;i++){
           queue.add(queue.peek());
           queue.remove();
       }
        System.out.println("\nThe elements after sorting by "+k+"th position:");
        System.out.println(queue);

    }

}
