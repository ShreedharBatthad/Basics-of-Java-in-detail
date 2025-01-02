package OOPS;

public class Inheritance_Lab_88
{
    void apple()  //Super/Parent Class
    {
        System.out.println("Apple is a Fruit");
    }
}
 class Fruit extends Inheritance_Lab_88 // Child class or sub class
 {
     public static void main(String[] args)
     {

         Inheritance_Lab_88 fruit = new Inheritance_Lab_88();
         fruit.apple();
     }
 }


