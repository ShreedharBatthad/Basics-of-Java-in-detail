package BIterativeStatements_04;

public class Lab_52
{
    public static void main(String[] args)
    {
        //continue......
        for(int i=0; i<10; i++)
        {
            System.out.println(i);
            if(i==5) continue;  //It will not print the next statement, if mention the "COntinue", but still it will print  remaining conditions.
            System.out.println("Next");
        }
    }
}
