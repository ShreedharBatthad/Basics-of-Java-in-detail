package Basic_03;

import java.util.Scanner;

public class Lab_28
{
    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);
        System.out.println("Choose the Washing Machine Mode");
        String mode = sc.next();

        boolean power = false;
        if(power)
        {
            switch (mode)
            {
                case "Express Wash":
                    System.out.println("It will wash the clothes within 30 minutes");
                    break;
                case "Baby Wear":
                    System.out.println("Take only Slim clothes & it will complete within 40 minutes");
                    break;
                case "Mixed Solid":
                    System.out.println("It will take more than 1 hour to complete the wash");
                    break;
                default:
                    System.out.println("Oops No Power!");
            }
        }else System.out.println("No Power");
    }
}
