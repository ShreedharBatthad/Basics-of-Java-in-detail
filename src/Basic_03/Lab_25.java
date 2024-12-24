package Basic_03;

import java.util.Scanner;

public class Lab_25
{
    public static void main(String[] args)
    {
        //Switch Condition:
        //

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1 to 17");
        int dayNumber = sc.nextInt();
        switch (dayNumber)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thr");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Input!");
        }

    }
}
