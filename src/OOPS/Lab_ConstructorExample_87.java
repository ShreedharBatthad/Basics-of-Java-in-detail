package OOPS;

public class Lab_ConstructorExample_87
{
    //Declaration.
    int days ;
    String Course ;


    Lab_ConstructorExample_87(int i , String c) //Parameterised Constructor.// Constructor Does not have return type.
    {
        this.days=  i;   // this keyword refers to the Child Class.
        this.Course = c;
    }

    public static void main(String[] args)
    {
        //Object Creation.
        Lab_ConstructorExample_87 Student = new Lab_ConstructorExample_87(10,"Java");

        // Calling Variables using the object reference and Printing them using SOP.
        System.out.println("Duration of th course is:  " +Student.days+ " " +"Programming Language name is: "+Student.Course);


    }
}
