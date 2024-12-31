package BArrays_06;

public class Lab_72
{
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        System.out.println("Length is: " + arr1.length); // length always be a total will be 5. starts from "1".
        System.out.println("Ref of variable: " + arr1); // if we call directly with variable, we get output of refernce.

        for(int i=0 ; i< arr1.length; i++)  //here we will consider length in index format. starts from "0".
        {
            System.out.println(arr1[i]);
        }
    }
}
