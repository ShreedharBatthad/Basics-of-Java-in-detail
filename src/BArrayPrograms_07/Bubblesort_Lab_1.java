package BArrayPrograms_07;
public class Bubblesort_Lab_1
{
    public static void main(String[] args)
    {
        int [] a = {36,19,29,12,5};
        int temp;
        for (int i =0; i<a.length; i++)
        {
            //System.out.println();
            int flag=0;
            for(int j=0; j<a.length-1; j++)
            {
                if (a[i] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag=1;
                }
            }
            if(flag==0)
             {
                break;
             }
        }
          for(int i =0; i<a.length; i++)
                         {
                              System.out.println(a[i] +"");
                         }
    }
}