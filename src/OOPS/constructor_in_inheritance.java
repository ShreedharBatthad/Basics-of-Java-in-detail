package OOPS;

public class constructor_in_inheritance
{
    //variables
    int count;
    String apple;

    // Parameterized Constructor
    public constructor_in_inheritance(int count, String apple)
    {
        //this keyword refers to current class.
        this.apple = apple;
        this.count = count;
    }

    public static void main(String[] args)
    {
        //object creation of the class
       constructor_in_inheritance con = new constructor_in_inheritance(2, "Orange");
        System.out.println(con.apple);
        System.out.println(con.count);

    }
}
