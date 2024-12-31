package BIterativeStatements_04;

public class Lab_48
{

        public static void main(String[] args)
        {

            // i want to stop/ break the program.

            for(int i=1; i<=10; i++)
            {
                //System.out.println("Value of: " + i);

                {
                    if (i == 5)
                        break;
                }
                System.out.println("Value of: " + i);

            }
            System.out.println("End");
        }
    }

///OUTPUT-->
//1
//2
//3
//4

