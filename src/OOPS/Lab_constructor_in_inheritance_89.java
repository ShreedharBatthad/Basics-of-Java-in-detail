package OOPS;

public class Lab_constructor_in_inheritance_89
{
    //variables
    int count;
    String apple;

    // Parameterized Constructor
    public Lab_constructor_in_inheritance_89(int count, String apple)
    {
        //this keyword refers to current class.
        this.apple = apple;
        this.count = count;
    }

    public static void main(String[] args)
    {
        //object creation of the class
       Lab_constructor_in_inheritance_89 con = new Lab_constructor_in_inheritance_89(2, "Orange");
        System.out.println(con.apple);
        System.out.println(con.count);

    }
}
