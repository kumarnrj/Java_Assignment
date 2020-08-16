package com.demo;

import java.util.Scanner;
/*Q.2: Create two classes:
        BaseClass
        The Rectangle class should have two data fields-width and height of int types. The class should have display() method, to print the width and height of the rectangle separated by space.
        DerivedClass
        The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of Rectangle class.The class should have read_input() method, to read the values of width and height of the rectangle. The class should also overload the display() method to print the area (width*height) of the rectangle.
        Input Format
        The first and only line of input contains two space separated integers denoting the width and
        height of the rectangle.
        Constraints
        1 <= width, height <= 10^3
        Output Format
        The output should consist of:
        Print the width and height of the rectangle.
        In the second line, print the area of the rectangle.
        */
class Rectangle{
    protected int  width,height;


      void  display(){
        System.out.println(width+" "+height);
    }
}
class RectangleArea extends  Rectangle{

    void read_input(){
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        height = sc.nextInt();
    }

    // overloading the display metho

    public void display(Rectangle r){

        System.out.println(width*height);
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.read_input();

        //parent class display() method will be called
        rectangleArea.display();

        // to call the child class display method
        Rectangle r = new Rectangle();
        rectangleArea.display(r);

    }

}
