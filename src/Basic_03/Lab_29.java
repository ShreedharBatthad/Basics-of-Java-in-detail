package Basic_03;

import java.util.Scanner;

public class Lab_29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the characters");
        char input = sc.next().toCharArray()[0];

        switch (input)
        {
            case 'a':
                System.out.println("Vowel");
            break;
            case 'e':
                System.out.println("Vowel");
            break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
        }
    }
}