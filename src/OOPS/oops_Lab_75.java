package OOPS;

public class oops_Lab_75
{
    //called method.
    public void eat()
    {
        System.out.println("Dog is eating");
    }
    public static void main(String[] args)
    {
        //calling method
         System.out.println("method calling");
         oops_Lab_75 pupy =  new oops_Lab_75();
         pupy.eat();
         System.out.println("come out of the main");
    }
}

