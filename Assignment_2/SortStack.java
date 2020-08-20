package com.Assignment_2;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        System.out.println("The elements of the stack before sorting:");
        System.out.println(stack);

        // calling the function to sort the stack element using a temporary stack
        SortStack(stack);
    }

    public static void SortStack(Stack<Integer> stack){
        Stack<Integer> tempStack= new Stack<>();

        while(!stack.isEmpty()){
            int num = stack.pop();

            while(!tempStack.isEmpty() && tempStack.peek()>num){
                // push the element of temp stack to the original stack
                stack.push(tempStack.pop());
            }
             // add the element to the temporary stack
            tempStack.push(num);
        }

        System.out.println("The elements of the stack after sorting are:");
        System.out.println(tempStack);
    }
}

