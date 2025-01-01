package BArrayPrograms_07;

public class FizzBuzz_Lab_3
{
    public static void main(String[] args)
    {
        int FizBuzz=0;
        int Fizz=0;
        int Buzz=0;

        for(int i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizBuzz");
                FizBuzz++;
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
                Fizz++;

            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
                Buzz++;
            }
            else
            {
                System.out.println(i);
            }
        }
        System.out.println("Total values of FizzBuzz are: " + FizBuzz);
        System.out.println("Total  Fizz are: " + Fizz);
        System.out.println("Total Buzz are:  " +Buzz);
    }
}
