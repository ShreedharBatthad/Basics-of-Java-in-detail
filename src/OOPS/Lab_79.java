package OOPS;

public class Lab_79
{
    String color;
    int age;

    void intobj(String c,int a)
    {
        color = c;
        age = a;
    }
    void display()
    {
        System.out.println(color+"  "+age);
    }

    public static void main(String[] args)
    {
        Lab_79 b = new Lab_79();
        b.intobj("Red", 10);
        b.display();

    }
}
