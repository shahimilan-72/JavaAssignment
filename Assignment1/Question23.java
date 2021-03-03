
/*23.	Write a Program to sum 1 to nth natural numbers.*/
package Assignment1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question23
{
    public static void main (String [] args)//main method declaration
    {
        Scanner input =  new Scanner(System.in);//prompt user to input
        System.out.println("------Determining the sum of natural numbers-----");
        System.out.println("Please enter any natural number");//prompt user to input
        int Number = input.nextInt();
        Addition(Number);//method calling

    }

    public static void Addition(int Number)//method declaration
    {   int  Sum = 0;//variable declaration
        for (int i = 1; i <= Number; i++)
        {
          Sum = Sum + i;//formula to calculate sum
        }
        System.out.println("The sum of the numbers from 1 to " + Number + " is " +Sum);//print result
    }
}