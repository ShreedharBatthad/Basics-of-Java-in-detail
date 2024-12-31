package BArrays_06;

import java.util.SortedMap;

public class Lab_71
{
    public static void main(String[] args)
    {

         int [] arr1 = {1,2,3,4,5};
         int [] arr2 = {1,2,3,4,5,};
         int [] arr3 = arr1;

        System.out.println(arr1==arr2);
        System.out.println(arr1.equals(arr2));  //
        System.out.println(arr1==arr3);
        System.out.println(arr1.equals(arr3));

     }
}
