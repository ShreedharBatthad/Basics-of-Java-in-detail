package Method_overloading;

public class Lab_method_over_case5_varagrs_99
{
    void show(int a)
    {
        System.out.println("int methopd");
    }
    //multi argument in the method signature
    void show(int... a)
    {
        System.out.println("mutltiple arguments method");
    }

       //varags : methods allow zero to multiple arguments
    public static void main(String[] args)
    {

        Lab_method_over_case5_varagrs_99 arg = new Lab_method_over_case5_varagrs_99();
        arg.show(1,2,3);
        arg.show();  // if we didn't enter the value still there is no ambiguity for JVM because og VARAGRS method.
    }
}
