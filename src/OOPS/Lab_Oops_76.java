package OOPS;

public class Lab_Oops_76
{

    public void eat()
      {
        System.out.println("Dog is eating");
      }
    public void run()
       {
        System.out.println("Dog is running to survive");
       }

    public static void main(String[] args)
      {
      //Object creation
      Lab_Oops_76 Dog = new Lab_Oops_76();
      //object method calling.
      Dog.eat();
      Dog.run();
      Dog.sleep();

      }

    public void sleep()
    {
        System.out.println("Dog is sleeping");
    }
}
