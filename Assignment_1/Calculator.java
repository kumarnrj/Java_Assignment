package com.demo;

import jdk.nashorn.internal.runtime.ECMAException;

/*Q.1: Design a Calculator class which contains four lambda methods:
        a. add(a, b)
        b. difference(a, b)
        c. product(a, b)
        d. safeDivision(a, b)
        Also design the main methods which pass actual parameters to test the Calculator class.

        */
public class Calculator {
    public static void main(String[] args) {
        // creating the lambda expression for add
       Add Lambdaadd =(int a,int b)->{ return a+b;};

       //Creating the lambda expression for difference
       Difference LamdaDiff =(int a,int b)->{ return a-b;};

       // Creating the lambda expression for product
       Product LambaPro = (int a,int b)->{ return a*b;};

       // Creating the lambda expression for safeDivision
       SafeDivision LambdasafeDiv = (int a,int b)->{
         if(b==0)
             System.out.println("Cannot divide by zero");
         else
             System.out.println(a/b);
       };

        System.out.println(Lambdaadd.add(10,5));
        System.out.println(LamdaDiff.diff(10,5));
        System.out.println(LambaPro.product (10,5));
        LambdasafeDiv.safeDivision (10,0);


    }
    @FunctionalInterface
    interface  Add{
        public int add(int a,int b);
    }
    @FunctionalInterface
    interface  Difference{
        public int diff(int a,int b);
    }

    @FunctionalInterface
    interface  Product{
        public int product(int a,int b);
    }
    @FunctionalInterface
    interface  SafeDivision{
        public void safeDivision(int a,int b);
    }

}
