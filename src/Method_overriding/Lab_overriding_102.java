package Method_overriding;

    class Lab_overriding_102
{
       //case.1 --> /Parent method/ - String void show(int a)  -> Fail.
       //case.2 --> /Parent method/ - String void show(int a)  -> Pass.
       //case.3 --> /Parent method/ - Object void show(int a)  -> Pass.
       //case.4 --> /Parent method/ - Object void show(int a)  -> Pass.

         Object  show(int a)
              {
                  System.out.println("Parent");
                  return null;

              }
}
    class nest extends Lab_overriding_102
    {
        //case.1 --> /Child Method/ - Object void show(int a)  -> Fail.
        //case.2 --> /Child method/ - String void show(int a)  -> Pass.
        //case.3 --> /Child method/ - Object void show(int a)  -> Pass.
        //case.4 --> /Child method/ - String void show(int a)  -> Pass.

          Object show(int a)
               {
                     System.out.println("Child");
                     return null;

               }

        public static void main(String[] args)

        {
                        nest a = new nest();
                        a.show(2);

                        Lab_overriding_102  f = new Lab_overriding_102();
                        f.show(8);
        }
    }