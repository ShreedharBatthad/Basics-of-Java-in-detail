package IterativeStatements;

public class Lab_43
{
    public static void main(String[] args) {

        int countdown = 3;

        while(countdown>0)
        {
            System.out.println(countdown);
            //3>=0 print the 3
            // now decrement by 1.
            //2>=0  print the 2
            // now decrement by 1
            // 1>=0 print the 1
            // NOW Come outside the loop.

            countdown--;
        }
        //print the outside loop.
        System.out.println("Lets Play Cricket");
    }
}
