package com.Assignment_2;


import java.util.Stack;

class Node
{
    int data;
    Node next;
}

class LinkedList
{
      Node head;
      public LinkedList(){
          head= null;
      }

      void insert(int data){
          Node new_node = new Node();
          new_node.data = data;
          new_node.next = null;

          if(head==null){
              new_node.next = head;
              head = new_node;
          }
          else{
              Node p = head;
              while(p.next!=null){
                  p= p.next;
              }
              p.next = new_node;
          }
      }

      // using stack
      void reverseLL()
      {
          Stack<Integer> s = new Stack<>();
          Node p =head;
          while (p!=null){
              s.push(p.data);
              p =p.next;
          }
          while(!s.empty()){
              int val = s.pop();
              System.out.println(val);
          }

      }

      // using linkedlist

    void revLink(){
          Node p,q,r;
          p= head;
          q=r=null;

          while(p!=null){
              r=q;
              q=p;
              p =p.next;
              q.next = r;
          }
          head = q;
    }
      void printLL(){
          Node p = head;
          while (p!=null){
              System.out.println(p.data);
              p=p.next;
          }
      }


}
public class RevLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(23);
        linkedList.insert(45);
        System.out.println("Initial linked list");
        linkedList.printLL();

        System.out.println("Reversing linked list using stack:");
        linkedList.reverseLL();

        System.out.println("Reversing linked list using sliding window technique");
        linkedList.revLink();
        linkedList.printLL();


    }
}
