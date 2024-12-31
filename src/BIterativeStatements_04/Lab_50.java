package BIterativeStatements_04;

public class Lab_50
{
    public static void main(String[] args)
    {
         int count =0;
        ////Print the number of Even number between 1 to 50.
        for(int i=0; i<50; ++i)
        {
            if(i%2==0)
            {
                System.out.println("The Number is Even" + i);
                count++;
            }
        }
                System.out.println("Total number of Even are: " + count);
    }
}
