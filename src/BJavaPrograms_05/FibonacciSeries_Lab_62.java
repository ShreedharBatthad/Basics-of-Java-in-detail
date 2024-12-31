package BJavaPrograms_05;

public class FibonacciSeries_Lab_62
{
    public static void main(String[] args)
    {
        // Fibonacci Series.
        // a=0,b=1,c=a+b =0+1 =1, c=1+2 =3, c=5+3 =8, c=8+4=13;
        int a=0,b=1;
        int c;
        for(int i=1; i<=10; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
