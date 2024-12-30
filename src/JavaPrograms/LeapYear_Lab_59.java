package JavaPrograms;
import java.util.Scanner;
public class LeapYear_Lab_59
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();

        //condition
        if((year%400==0) || (year%4==0) && (year%100!=0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }

}
