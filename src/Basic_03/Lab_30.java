package Basic_03;

public class Lab_30
{
    public static void main(String[] args)
    {

        //After JDK 13 we can use below criteria

        int sample = 003;
        switch (sample)
        {
            case  001,002,003: /// multiple values can be used in the switch after jdk 13.
               System.out.println("Route to North");
               break;
            case 004,005,006:
                System.out.println("Route to South");
                break;
            default:
                System.out.println("Neither South or North");
        }
    }
}
