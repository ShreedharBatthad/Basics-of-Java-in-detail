package Method_overriding;

public class Lab_100
{
    /// method 1
    void show(int a)
    {
        System.out.println("Parent class");
    }
}
  //inheritance
 class B extends Lab_100
{
    //method 2
    void show(int a)
    {
        System.out.println("Child class");
    }

    public static void main(String[] args)

    {
        //parent class object
        Lab_100 a = new Lab_100();
        a.show(10);

        //child class object
        B b= new B();
        b.show(100);
    }
}
