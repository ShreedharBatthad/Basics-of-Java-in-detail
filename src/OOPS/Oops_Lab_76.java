package OOPS;
import java.util.logging.SocketHandler;
public class Oops_Lab_76
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
      Oops_Lab_76  Dog = new Oops_Lab_76();
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
