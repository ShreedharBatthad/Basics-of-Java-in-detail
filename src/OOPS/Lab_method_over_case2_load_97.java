package OOPS;

public class Lab_method_over_case2_load_97
{
    void show(StringBuffer a)
     {
        System.out.println("Object_method");
     }
     void show(String a)
     {
         System.out.println("string_method");
     }
    public static void main(String[] args)
     {
         Lab_method_over_case2_load_97 df = new Lab_method_over_case2_load_97();
         df.show("abc");
         df.show(new StringBuffer("rcb"));
    }
}
