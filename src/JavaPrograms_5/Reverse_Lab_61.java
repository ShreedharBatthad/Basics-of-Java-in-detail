package JavaPrograms_5;

public class Reverse_Lab_61
{
    public static void main(String[] args)
    {
        //Reverse a string.
         String name = "shreedhar";
         int len  = name.length()-1;
         String rev = "";
         for(int i =len; i>=0; i--)
         {
             rev = rev + name.charAt(i);
         }
        System.out.println("Reverse of string is:  " + rev);
    }
}
