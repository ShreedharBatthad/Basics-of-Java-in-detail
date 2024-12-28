package IterativeStatements;

public class Lab_47
{
    public static void main(String[] args)
    {

      // i want to stop/ break the program.

      for(int i=1; i<=10; i++)
      {
          System.out.println("Value of: " + i);
          //// at the time of i = 5, line 12th will be printing, but it goes to if loop, condition will fail.
         // but this will be printed.
          {
              if (i == 5)
                  break;
          }
//          System.out.println("Value of: " + i);
         // line 9, when it comes to i =5, above statement will not be printed, because condition is failed in if loop position.
      }
        System.out.println("End");
    }
}
///OUTPUT-->
//1
//2
//3
//4
//5