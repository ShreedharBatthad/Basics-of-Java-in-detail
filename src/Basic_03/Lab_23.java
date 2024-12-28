package Basic_03;

import java.util.Scanner;

public class Lab_23
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Student Score");
        int score = sc.nextInt();

        if(score>=90 && score <=100)
        {
            System.out.println("Your Score -->A Grade");
        } else if (score>=80 && score <=89)
        {
            System.out.println("Your Score --> B Grade");
        } else if (score>=70 && score<=79)
        {
            System.out.println("Your Score --> C Grade");
        } else if (score>=60 && score<=69)
        {
            System.out.println("Your Score --> D Grade");
        } else if (score>=50 && score<=59)
        {
            System.out.println("Your Score --> E Grade");
        } else if (score>40 && score<=35)
        {
            System.out.println("Your Score --> F Grade");
        }

    }
}
