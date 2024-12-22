package Basic_03;

public class Lab_13
{
    public static void main(String[] args)
    {
        //Ternary Operator
        //int a= condition ? if this is true do this/use this : if this is false use this/do this.

        int a = true ? 10 :20;
        System.out.println(a);

        int b = (30>40) ? 10:20;
        System.out.println(b);

        String c = 30>40 ? "10" : "Twenty";
        System.out.println(c);

        String d= 30<40 ? "10" : "Twenty";
        System.out.println(d);

    }
}
