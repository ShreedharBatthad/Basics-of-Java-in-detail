package Basic_03;

public class Lab_09
{
    public static void main(String[] args)
    {

        // Object is created in the "String Constant Pool".
        String  s1 = "Sunday";
        // new is a keyword used to create a object, object created in both SCP and Heap area.
        // S2 reference to the "Heap Area" and JVM is refering to the SCP.
        String s2 = new String("Sunday");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2); // false : because two different objects.""=="" -> Reference to the object reference.
        System.out.println(s1.equals(s2)); // true : Content is Similar. "s1.equals(s2)" -> Reference to the Content of the Objects.



    }
}
