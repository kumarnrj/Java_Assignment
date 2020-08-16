package com.demo;


import java.util.Date;

/*Q.6: Write a program, creating a class which contains a method that would print the information (name, year of joining, salary, address) of three employees by creating a class
named 'Employee'. The output should be as follows:
        Name Year of joining Address
        Robert 1994 64C- WallStreet
        Sam 2000 68D- WallStreet
        John 1999 26B- WallStreet

       */
class EmployeeInfo{
    String  name;
    double salary;
    int yearOfJoining;
    String  Address;

    public  EmployeeInfo(String name,int yearofJoining,double salary,String  address){
        this.name = name;
        this.yearOfJoining = yearofJoining;
        this.salary = salary;
        this.Address = address;
    }

    public  void PrintDetail(){

        System.out.println(name+"\t\t"+yearOfJoining+"\t\t"+Address);
    }
}
public class EmployeeInfoDemo {
    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new EmployeeInfo("Robert" ,1994 ,150000,"64C- WallStreet");
        EmployeeInfo employeeInfo1 = new EmployeeInfo("Sam   ", 2000,100000, "68D- WallStreet");
        EmployeeInfo employeeInfo2 = new EmployeeInfo("John  ", 1999,20000, "26B- WallStreet");
        System.out.println("Name\t"+"Year of Joining\t"+"Address");
        employeeInfo.PrintDetail();
        employeeInfo1.PrintDetail();
        employeeInfo2.PrintDetail();
    }
}
