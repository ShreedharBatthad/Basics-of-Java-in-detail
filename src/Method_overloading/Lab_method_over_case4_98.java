package Method_overloading;

public class Lab_method_over_case4_98
{
    void show(int a, float b)
    {
        System.out.println("int float");
    }

    void show(int b, String a)
    {
        System.out.println("string int");
    }

    public static void main(String[] args)
    {
       Lab_method_over_case4_98 ld = new Lab_method_over_case4_98();
      // error ld.show(10.0f, 10.5f);
        ld.show(2, 10.58858f);
        ld.show(2,"hjk");

    }
}
