package Basic_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_26
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Browser name");
       String browser = sc.next();

       switch (browser)
       {
           case "chrome":
               System.out.println("Chrome Browser is Executed");
           break;
           case "opera":
               System.out.println("Opera Browser is Executed");
           break;
           case "firefox":
               System.out.println("Firefox Browser is Executed");
           break;
           case "edge" :
               System.out.println("Edge Browser is Executed");
           break;
           default:
               System.out.println("Oops Invaild Browser Name!");

       }
    }
}
