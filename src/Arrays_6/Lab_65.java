package Arrays_6;

public class Lab_65
{
    public static void main(String[] args)
    {
        // How to add new values in the exist Array.
        String [] Bird = {"Parrot", "Pigeon", "Peacock", "Crane"};
        Bird[0] = "Sparrow";           // This is the condition need to use to add the New Values in the Exist.
        System.out.println(Bird);      //Randomvalueoutput.
        System.out.println(Bird[0]);   //Firstpositionvalue.
        System.out.println(Bird[7]);   // Error --> Indexoutofbound Exception because the values are beyond 5th position.
    }
}
