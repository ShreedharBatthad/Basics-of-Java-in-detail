package Basic_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_27 {
    public static void main(String[] args) {
        // mixing up with both if and switch.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num  = sc.nextInt();

        boolean useSwitch = true;

        if (useSwitch) {
            switch (num) {

                case 1:
                    System.out.println("Number is 10");
                    break;
                case 20:
                    System.out.println("NUmber is 20");
                    break;
                default:
                    System.out.println("number is neither 10 nor 20");
            }

        } else{
            System.out.println("Switch block is not executed");
        }
    }
}