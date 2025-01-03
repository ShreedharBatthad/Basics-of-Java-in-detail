package OOPS;

public class Singleinheritance_Lab_88
{
    void Singleinheritance_Lab_88()
    {
        System.out.println("Print A");
    }

    public class B extends Singleinheritance_Lab_88
    {
        void ShowB()
        {
            System.out.println("Class B");
        }
    }

    class c extends B
    {
        void Showc() {
            System.out.println("Class C");
         }


        public static void main(String[] args)
        {
            Singleinheritance_Lab_88 A = new Singleinheritance_Lab_88();
            A.Singleinheritance_Lab_88();

            //-----------------------//


        }
    }
}