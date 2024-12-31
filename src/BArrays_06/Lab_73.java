package BArrays_06;

import java.util.Scanner;

public class Lab_73
{
        public static void main(String[] args)
        {
            //Take input user marks of 5 subjects and print the marks.
            //Scanner class;

            Scanner s = new Scanner(System.in);
            double[] marks = new double[5];
            double Failed=0;
            double Passed=0;

            System.out.println("Enter the First Subject");
            marks[0]= s.nextDouble();

            System.out.println("Enter the Second Subject");
            marks[1] = s.nextDouble();

            System.out.println("Enter the Third Subject");
            marks[2] = s.nextDouble();

            System.out.println("Enter the Fourth Subject");
            marks[3] = s.nextDouble();

            System.out.println("Enter the Fifth Subject");
            marks[4] = s.nextDouble();

            for (int i=0; i<marks.length; i++)
            {
                if(marks[i]<35)
                {
                    System.out.println("Failed subjects: " + marks[i]);
                    Failed++;
                }
                else
                {
                    System.out.println("Passed subjects: " + marks[i]);
                    Passed++;
                }

            }
            System.out.println("Total Failed Subjects are :" +Failed);
            System.out.println("Total Passed Subjects are :" +Passed);
            s.close();
        }

    }

