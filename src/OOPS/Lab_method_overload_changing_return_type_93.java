package OOPS;

public class Lab_method_overload_changing_return_type_93
{
    //different return type
    void show (int a)
    {
        System.out.println("Parent arg");
    }
    //different return type
    String show(String  a)
    {
        System.out.println("Child arg");

        return a;
    }
    public static void main(String[] args)
    {
     Lab_method_overload_changing_return_type_93  OD = new Lab_method_overload_changing_return_type_93();
     OD.show(10);
    }
}
