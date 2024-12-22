package Basic_03;

public class Lab_07
{
    public static void main(String[] args)
    {
        //Casting
         byte b = 10;
         int a = (int)b;
         // Widening
         // Here implicit is done by Jvm.
         // Here explicit will not work, because already JVM has been changed by default.

        int a1 = 300;
        byte b1 = (byte) a1;
        // Narrowing.
        // Here Implicit is not done by Jvm.
        // Here Explicit is Done by User.

        System.out.println(a);
        System.out.println(a1);
    }
}
