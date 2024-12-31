package BIterativeStatements_04;

public class Lab_54
{
    public static void main(String[] args)
    {
        for(int i=1; i<=35; i++)
        {

            if(i%2==0)
            {
                System.out.println("Even number is: " + i);
                continue;
            }
            System.out.println("Odd Number is: " + i);
        }
    }
}

