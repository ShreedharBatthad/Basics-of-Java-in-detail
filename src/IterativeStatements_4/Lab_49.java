package IterativeStatements_4;

public class Lab_49
{
    public static void main(String[] args)
    {
        // Print the Odd Number in between the 1 to 50//
        int count = 0; // to print the total number of odd numbers
        for(int i=0; i<=50; i++)
        {
            if (i % 2 == 1)
            {
                System.out.println("It is Odd Number " + i);
                count++;
            }
        }

        System.out.println("Total Number of Odd in 1 to 50 is :" + count);
    }
}

