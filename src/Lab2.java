public class Lab2
{
        //Main Method -> Execution Starts from Main Method.
    public static void main(String[] args)
    {
        //"Variabe" is like a container, where we can store the data or values, in which it is used for future related Stuff.
        // AGE IS LOCAL VARIABLE.
        // LOCAL VARIABLE, IS USED WHICH IN THE MAIN METHOD, WE CALL IT IS "LOCAL VARIABLE".
        // "age" is a variable
        //Range of Byte --> -128 to 127.
        byte age =10;
        age = 127;
        //age = 127+1; // OUT OF RANGE. output will be: **""incompatible types: possible lossy conversion from int to byte"**

        System.out.println("Age of Current Month Child is : " + age) ;
        //below line represent,we are not incrementing the Variable "age",just adding in the Print Statement it looks like Concat.
        //If we add in the Print Statement,it will not increment the "VARIABLE".
        //Suppose,if we mention in the VARIABLE, THEN IT IS OUT OF RANGE OF "BYTE".
        System.out.println("In future age of the child will be : " + age+1);
    }
}
