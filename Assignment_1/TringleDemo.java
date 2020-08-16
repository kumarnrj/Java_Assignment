package com.demo;
/*Q.7: Write a program, creating a Triangle class which contains a method that takes three parameters of the three sides of
        the triangle, ‘a’, ‘b’, ‘c’, and returns you with the area of the triangle and print it.

*/

class Tringle
{
    int a,b,c;
    int s=0;
    public Tringle(int a,int b,int c){
        this.a = a;
        this.b =b;
        this.c = c;
    }
    // using heron's formula


    public double getArea(){
        s = (a+b+c)/2;
        double area =0;
        area = Math.sqrt( s*(s-a)*(s-b)*(s-c));
        return  area;
    }
}
public class TringleDemo {
    public static void main(String[] args) {
        Tringle tringle = new Tringle(122,120,22);
        System.out.println("Area of Tringle: "+tringle.getArea());

    }
}
