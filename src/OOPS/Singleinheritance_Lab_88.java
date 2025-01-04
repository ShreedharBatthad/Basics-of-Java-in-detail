package OOPS;

public class Singleinheritance_Lab_88
{
      void supera()
      {
          System.out.println("Parent Class");
      }

}

class Dog extends Singleinheritance_Lab_88
{

      void Animal()
      {
          System.out.println("Child Class");
      }

    public static void main(String[] args)
    {
       Singleinheritance_Lab_88 obj = new Singleinheritance_Lab_88();
       obj.supera();
      // obj.Animal();// we cannot call the child class using the Parent class Object.

    }

}