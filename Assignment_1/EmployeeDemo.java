package com.demo;

/*Q.3: Write a program, creating an Employee class containing details of empId, empName, empDesignation,
empSalary and empLocation. Create necessary methods like getters, setters and toString. Create 10 instances of the same.

        The problem is to generate stream of all the instances and do the following operations:
        a. Print the name of all the employees.
        b. Print all the salaries which are greater than 50,000/-
        c. Print all the locations starting with the letter ‘M’
        d. Print all the designations ending with ‘E’
*/

import java.util.Arrays;
import java.util.List;
class Employee{

    private int empId;
    private String empName;
    private String empDesignation;
    private  double salary;
    private String empLocation;

   public Employee(int empId,String empName,String empDesignation,double salary,String empLocation){
      this.empId = empId;
      this.empName = empName;
      this.empDesignation = empDesignation;
      this.salary = salary;
      this.empLocation = empLocation;
    }

    public void setEmpId(int empId){
       this.empId = empId;
    }
    public  void setEmpName(String empName){
       this.empName = empName;
    }
    public  void setEmpDesignation(String empDesignation){
       this.empDesignation = empDesignation;
    }
    public void setSalary(double salary){
       this.salary = salary;
    }
    public  void setEmpLocation(String empLocation){
       this.empLocation= empLocation;
    }

    public  int getEmpId(){
       return this.empId;
    }
    public String getEmpName(){
       return this.empName;
    }
    public String getEmpDesignation(){
       return  this.empDesignation;
    }
    public String getEmpLocation(){
       return this.empLocation;
    }
    public  double getSalary(){
       return this.salary;
    }

    public String toString(){
         return "Id: "+empId +" Name:"+empName+" Designation: "+empDesignation+" :location:"+empLocation;
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(100,"Neeraj","CEO",150000,"UK"),
                new Employee(101,"KAYLING","EXECUTIVE",45000 ,"Mexico City" ),
                new Employee( 102,"Steven ","MANAGER", 27500.,"Roma"),
                new Employee(103,"CLARE ","MANAGER",85000,"Venice"),
                new Employee(104,"JONAS","ANALYST",52000,"Tokyo"),
                new Employee(105,"SCARLET","ANALYST",49500,"Miami"),
                new Employee(106,"SANDRINE","CLERK",90000,"Southlake"),
                new Employee(107,"ADELYN","SALESMAN",36000,"California"),
                new Employee(108,"TUCKER","SALESMAN",45000,"Toronto"),
                new Employee(109, "ADNRES","CLERK",65000,"Seattle")
        );
        //System.out.println(employeeList);

        // 1.  Print the name of all the employees.

        System.out.println("All the Name of the Employee: ");
        employeeList.stream().filter(e -> e.getEmpName().startsWith("")).forEach(e -> System.out.println(e.getEmpName()));
        System.out.println();

        // 2. Print all the salary greater than 50000.
        System.out.println("The Salaries which are grater than 50k");
        employeeList.stream().filter(e-> e.getSalary()>50000).forEach(e-> System.out.println(e.getSalary()));
        System.out.println();

        // Print all the locations starting with the letter ‘M’
        System.out.println("The location which are starting with the letter 'M");
        employeeList.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e-> System.out.println(e.getEmpLocation()));
        System.out.println();

        // 4. Print all the designations ending with ‘E’
        System.out.println("All the Designations ending with 'E'");
        employeeList.stream().filter(e->e.getEmpDesignation().endsWith("E")).forEach(e-> System.out.println(e.getEmpDesignation()));
    }
}
