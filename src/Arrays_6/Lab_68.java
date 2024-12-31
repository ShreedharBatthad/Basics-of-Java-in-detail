package Arrays_6;
public class Lab_68
{
    public static void main(String[] args)
    {
        //Single Dimension Array.
        //Declare, Create,Assign and Access Array.
        int [] a = new int[3];  // Declaration or Total Size/Space to create a Array.
        //Assigning the values for the array.
        a[0] = 45;
        a[1] = 50;
        a[2] = 55;
       // a[3] = 65;   // INDEXOUTOFBOUNDSEXCEPTION, Because Array size is exceeded.
        System.out.println(a.length); // Total length of the array.
        System.out.println(a[0]);     // Value of a[0] or Accessing the Value.

    }
}
