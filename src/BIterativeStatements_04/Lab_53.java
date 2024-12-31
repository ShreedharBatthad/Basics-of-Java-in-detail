package BIterativeStatements_04;

public class Lab_53
{

    //Printing the odd and even number, and total as well.
    public static void main(String[] args)
    {    int oddcount = 0;
         int evencount = 0;


        for(int i=1; i<=35; i++)
        {
           if(i%2==0)
           {
               System.out.println("Even number is: " + i);
               evencount++;
           }
           else
           {
               System.out.println("Odd Number is: " + i);
               oddcount++;
           }

        }
            System.out.println("Total even number is " + oddcount);
            System.out.println("Total odd number is: " + evencount);
    }
}
