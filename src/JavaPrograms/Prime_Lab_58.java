package JavaPrograms;
public class Prime_Lab_58
{
    public static void main(String[] args)
    {
        int i;
        int j;
        for (i = 1; i <= 100; i++)
        {
                       int count = 0;
                          for (j = 1; j <= i; j++)
                              {
                                  if (i%j==0)
                                    {
                                         count++;
                                    }
                              }
                                 if (count == 2)
                                    {
                                        System.out.println(i);
                                    }
        }
    }
}

                      //i =1 and j=1;  1%1=0;  now count is 1.
                              // i=1 and j=2; 1/2!=0;, now it come out of the loop