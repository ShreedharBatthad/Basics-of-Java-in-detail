package Method_overriding;

public class Lab_overiding_101
{


        Object show(int a)
    {
        System.out.println("object method is executed");
        return null;

    }
}
    class deve extends Lab_overiding_101
    {
        String show(int a)
        {
            System.out.println("string method is executed");
              return null;
        }


    public static void main(String[] args)
    {

        deve d = new deve();
        d.show(1);

        Lab_overiding_101 dk = new Lab_overiding_101();
        dk.show('1');
    }
}
