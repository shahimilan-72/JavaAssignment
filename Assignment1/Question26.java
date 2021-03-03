/*
26.	Write a Program to reverse the given number. //123 => 321
 */
package Assignment1;
import java.sql.SQLOutput;
import java.util.Scanner;

    public class Question26 //class definition
    {
        public static void main(String[] args)//main method declaration
        {
            int Reverse = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number (A)= ");//prompt user to input
            int A = input.nextInt();
            Value(A);
        }

        public static void Value(int A) { //value method declaration
            int Reverse = 0;
            while (A != 0)
            {
                int digit = A%10;
                Reverse = Reverse * 10 + digit; //formula to determine the reverse
                A = A / 10;
            }
            System.out.println ("The required reverse number is " +Reverse); //print the result
        }


    }
