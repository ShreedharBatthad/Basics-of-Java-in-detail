package OOPS;

public class Lab_methodoverload_case_1__95
{
    // method 1
    void show(int a)
    {
        System.out.println("Integer method is executed");
    }

    //method 2
    void show(String a)
    {
        System.out.println("String method is executed");
    }


    public static void main(String[] args)
    {
        Lab_methodoverload_case_1__95 load = new Lab_methodoverload_case_1__95();
        load.show(10); //we calling integer this time.

    }

}