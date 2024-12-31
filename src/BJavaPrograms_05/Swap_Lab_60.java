package BJavaPrograms_05;

public class Swap_Lab_60
{
    public static void main(String[] args)
    {

        int a = 10;
        int b = 20;
     //swapping the two numbers.
        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
