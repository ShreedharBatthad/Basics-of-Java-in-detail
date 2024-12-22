package Basic_03;

import java.util.Scanner;

public class Lab_21
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values");
        int a  = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Odd Number");

        }else
        System.out.println("Even Number");

    }
}
