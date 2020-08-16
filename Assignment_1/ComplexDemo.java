package com.demo;


/*Q.5: Print the sum, difference and product of two complex numbers by creating a class named
'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
*/

import java.util.Scanner;

class Complex
{
    int real,imaginary;
    public Complex(){}

    public  Complex(int real,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex SumCom(Complex c1,Complex c2){
        Complex temp = new Complex();

        temp.real = c1.real+c2.real;
        temp.imaginary = c1.imaginary+c2.imaginary;

        return temp;

    }

    Complex SubtractCom(Complex c1,Complex c2){
        Complex temp = new Complex();

        temp.real = c1.real-c2.real;
        temp.imaginary = c1.imaginary-c2.imaginary;

        return temp;

    }

    Complex ProductCom(Complex c1,Complex c2){
        Complex temp = new Complex();

        temp.real = c1.real*c2.real;
        temp.imaginary = c1.imaginary*c2.imaginary;

        return temp;

    }

    public  void display(){
        System.out.println("Complex number "+real+" + "+imaginary+"i");
    }
}
public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real,imaginary,real1,imaginary2;
        System.out.println("Enter the real part of the complex number 1 ");
        real = sc.nextInt();
        System.out.println("Enter the imaginary part of the complex number 1");
        imaginary = sc.nextInt();

        System.out.println("Enter the real part of the complex number 2");
        real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of the complex number 2");
        imaginary2 = sc.nextInt();

            Complex complex1 = new Complex(real,imaginary);
            complex1.display();
            Complex complex2 = new Complex(real1,imaginary2);
            complex2.display();
            System.out.print("Sum of ");

            Complex complex3 = new Complex();
            complex3 = complex3.SumCom(complex1,complex2);
            complex3.display();

            System.out.print("Difference of ");
            Complex complex4 = new Complex();
            complex4 = complex4.SubtractCom(complex1,complex2);
            complex4.display();

            System.out.print("Product of ");
            Complex complex5 = new Complex();
            complex5 = complex4.ProductCom(complex1,complex2);
            complex5.display();



    }
}
