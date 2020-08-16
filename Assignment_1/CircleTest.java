package com.demo;

class Circle{
    private double radius = 1.0;
    private String color = "red";
    public Circle(){}
    public Circle(double r){
        this.radius = r;
    }

    public double getRadius(){
        return  this.radius;
    }
    public  double getAread(){
        return  Math.PI * radius*radius;
    }
}
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("radius of the circle when no argument is passed: "+circle.getRadius());
        System.out.println(" Area of the circle "+circle.getAread());


        Circle circle1 = new Circle(3);
        System.out.println("radius of the circle when 3 is passed as a  argument : "+circle1.getRadius());
        System.out.println(" Area of the circle "+circle1.getAread());

    }
}
