package com.Assignment_2;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();

        int []arr = new int[n];
        System.out.println("Enter the array element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the which smallest number you want to print");
        int k;
        k  = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("The "+k+"th smallest number is: "+arr[k-1]);
    }
}
