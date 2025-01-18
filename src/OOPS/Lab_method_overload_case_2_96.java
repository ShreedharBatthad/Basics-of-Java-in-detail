package OOPS;

public class Lab_method_overload_case_2_96
{
    // void method 1.
    void show(Object a)
    {
        System.out.println("Object call");
    }
    // void method 2.
    void show(String a)
    {
        System.out.println("String call");
    }
    // main.
    public static void main(String[] args)
    {
           // object creation.
           Lab_method_overload_case_2_96 LD = new Lab_method_overload_case_2_96();
           LD.show("RCB");
          //Compiler will give preference to the child argument type.
    }
}

