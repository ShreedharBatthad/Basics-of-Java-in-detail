package IterativeStatements_4;

import java.util.Scanner;

public class Lab_55
{
    public static void main(String[] args)
    {

       //Factorial Program.
        long fact = 1;       //1^1 = 1, 1^2 =2*1, 1^3 =3*1,, Then we need keep 1 as a constant, hence long fact =1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number  = sc.nextInt();

        for (int i=1; i<=number; i++)
        {
            fact = fact*i;   //CASE1: int i=0,  CASE2: 1*0=0; 1*1=1; 1*2=2, 2*3=6,6*4=24,24*5= 120
        }
        System.out.println("Fact --->" + fact);
    }
}
