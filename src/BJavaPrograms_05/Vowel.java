package BJavaPrograms_05;

import java.util.Scanner;

public class Vowel
{

//WAP to check whether given character is a VOWEL or not
/// using switch statement
//Single Character.

        public static void main(String[] args)
        {

            System.out.println("Enter any charcter");
            Scanner sc = new Scanner(System.in);
            char c = sc.next().charAt(0);

            boolean vowel = false;


            switch(c) {


                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': vowel = true;
            }

            if(vowel)
            {
                System.out.println(c + " is a Vowel");

            }else
            {
                System.out.println(c + " is a Consonant");
            }
        }
}

