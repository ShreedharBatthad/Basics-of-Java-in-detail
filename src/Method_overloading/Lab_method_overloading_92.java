package Method_overloading;

public class Lab_method_overloading_92
{
    //methodoverloading: having same class with same method name but with diff arguments
     void show()
           {
               System.out.println("Not a Parameterized method");
           }
    void show(int a)
          {
              System.out.println("Parameterized method");
          }

    public static void main(String[] args)
         {
         Lab_method_overloading_92 load = new Lab_method_overloading_92();
         load.show(10);
         load.show();

        }
}
