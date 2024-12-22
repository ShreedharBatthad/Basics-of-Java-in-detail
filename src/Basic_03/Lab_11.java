package Basic_03;

public class Lab_11
{
    public static void main(String[] args)
    {
             String name = "Sindhanur is a Paddy Growing Area"; //Object is created in the SCP
//             System.out.println(name.length()-1);
//             System.out.println(name.length());
//             System.out.println(name.toUpperCase());
//             System.out.println(name.toLowerCase());

             String name1  = "Sindhanur is a Paddy Growing Area"; //Object is created in the SCP.

             System.out.println(name == name1); // true: Because, two objects are created in Heap Area.
             System.out.println(name.equals(name1)); // true: Beacuse, two objects having similar Data/record.

             String name2 = new String("Sindhanur is a Paddy Growing Area");  //Object is created in the Heap area
             if(name==name1 && name1==name2 && name==name2) //Object reference
            {
                     System.out.println("Object is created in the String Constant Pool");
            }
             else
             {
                    System.out.println("Object is created in the Heap Area");
             }
             if (name.equals(name2) && name.equals(name1))
            {
                    System.out.println("Data are same in the Two Objects");
            }
    }
}
