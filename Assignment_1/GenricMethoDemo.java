package com.demo;


// creating a custom exception with extends the exception class

class Myexceptio extends  Exception
{
    Myexceptio(String s){
        super(s);
    }
}
class GenericMethod
{
    // creation of generic method
    public  <T> void numberCheck(T value){
        try{
            // cheking the passed value if it will a string then it will throw an error
            if(value instanceof  String){
                throw new Myexceptio("Entered value is a String expect Number");
            }

            // since we do not know the type of the number therefore first we will convert
            // it into string and then convert it into double because we need a method calculate the
            // value for all number therefore declaring/ converting the passed variable will be a situable
            // choice because it will all the number.
            // if we will declare it as int then it will not accept double

            String  num = value.toString();
            double num1 = Double.parseDouble(num);

            System.out.println(num1* 2/3);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
public class GenricMethoDemo {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.numberCheck(12);
        genericMethod.numberCheck(34.3f);
        genericMethod.numberCheck(18.0d);

        // in the below case it will throw an exception
        genericMethod.numberCheck("neeraj");
    }
}
