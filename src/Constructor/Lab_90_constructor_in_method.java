package Constructor;

public class Lab_90_constructor_in_method
{
    String place;
    int ticket_id;

    // constructor
      public Lab_90_constructor_in_method(String place, int ticket_id)
      {
         this.place =place;
         this.ticket_id = ticket_id;
      }
   //  method
      public void display()
      {
          System.out.println("Place: " +place);
          System.out.println("ticket_id: " +ticket_id);
      }


    public static void main(String[] args)
    {
       Lab_90_constructor_in_method km = new Lab_90_constructor_in_method("mysore",1300);
       km.display();

    }
}
