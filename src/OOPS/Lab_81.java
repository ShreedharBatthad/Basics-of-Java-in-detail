package OOPS;

public class Lab_81
{
    int x= 10;
    int display()
    {
        System.out.println("Number");
        return 1;
       //// System.out.println("Number is printed"); //After return, we should not metion the SOUT statement.

    }
}
 class main
 {
     public static void main(String[] args)
     {
         Lab_81 b = new Lab_81();
        System.out.println(b.display());
         System.out.println(b.x);

     }
 }