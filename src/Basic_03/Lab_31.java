package Basic_03;

import java.util.Scanner;

public class Lab_31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the room number");
        int dum = sc.nextInt();
        switch (dum){
            case 001 -> System.out.println("it is a animal room");
            case 002 -> System.out.println("it is a bird room");
            case 003,004 -> System.out.println("it is a flower room");
            default -> System.out.println("Empty Room");
        }
    }
}
