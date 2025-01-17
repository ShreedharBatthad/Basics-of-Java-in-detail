package OOPS;

public class Lab_cons_inh_meth_91
{
           //variables
           String brand;
           int speed;

           //constructor
           Lab_cons_inh_meth_91(String brand, int speed)
          {

              this.brand = brand;
              this.speed = speed;
          }
         // methods
         void displayinfo()
          {
               System.out.println("car:" + brand);
               System.out.println("speed:" + speed);
         }
}
  //extends is a keyword used to achieve inheritance.
class car extends Lab_cons_inh_meth_91
{
         //variable
            String color;

        //constructor
          car(String brand, int speed, String color)
                 {
                //super keyword is used to call the parent class variables.
                      super(brand, speed);
                      this.color = color;

                }
    //method: set on code is used to perform particular task.
         void displaycarinfo()

                 {
                     //parent class calling method
                     displayinfo();
                     System.out.println("color: " + color);

                 }

    public static void main(String[] args)
    {
        //object creation.
        car c = new car("Benz", 150, "Red");
        c.displaycarinfo();
    }


}

