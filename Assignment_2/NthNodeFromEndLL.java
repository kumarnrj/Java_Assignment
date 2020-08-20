package com.Assignment_2;

import java.util.Scanner;

class node1{
    int data;
    node1 next;
}

class LinkedList1
{
     node1 head;

    public LinkedList1() {
        head = null;
    }

    void insert(int data){
        node1 new_node1 = new node1();
        new_node1.data = data;
        new_node1.next = null;

        if(head==null){
            new_node1.next = head;
            head = new_node1;
        }
        else{
            node1 p=head;
            while(p.next!=null){
                p = p.next;
            }
            p.next = new_node1;
        }
    }
    void printList(){
        node1 p=head;
        while(p!=null){
            System.out.print(p.data+" -> ");
            p = p.next;
        }
    }

    int Nthnode1(int n){
        node1 p=head;
        int len=0;
        while(p!=null){
            len++;
            p = p.next;
        }

        node1 q= head;
        n = len-n;
        if(n==0)
            System.out.println("The Element is not present \n");
        else{
            for(int i=0;i<n;i++){
                q = q.next;
            }
            return  q.data;
        }
       return 0;

    }
}

public class NthNodeFromEndLL {
    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);


        System.out.println("The Elements of the Linked List are: ");
        linkedList.printList();
        // return the 3 node1 from the last

        System.out.println("\nEnter the node which you want to return ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( "The "+n+"th from the last of the linked list is :"+ linkedList.Nthnode1(n));

    }
}

