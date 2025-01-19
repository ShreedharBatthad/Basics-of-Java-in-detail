package keywords;

public class Lab_this_case3_103
{
   Lab_this_case3_103 (int a)
   {

     System.out.println("Parameterised constructor");
   }

   Lab_this_case3_103()
   {
       // by using this keyword, here we are calling parent constructor and along with sending the values.
       this(10);
       System.out.println("no argument constructor");
   }

    public static void main(String[] args)
    {
      Lab_this_case3_103 G = new Lab_this_case3_103();


    }
}
