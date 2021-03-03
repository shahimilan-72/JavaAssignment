/*
13.	Write a program to print the number entered by the user only if the number entered is negative.
 */
package Assignment1;
import java.util.Scanner;

public class Question13 //class definition
{
    public static void main(String []args)//main method declaration
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----Print only negative number---------");

        System.out.print("Enter the number:  ");//prompt user to input
        double N = input.nextDouble();

        if(N <=-1) //if--else condition
            {
            System.out.println("The number " + N + " is negative");
            }
        else
            {
            System.out.println("The number " + N + " is positive");
            }
    }
}
