/*17.	Write a program to calculate leap year.*/
package Assignment1;
import java.util.Scanner;

public class Question17 //class definition
{
    public static void main (String []args)//method declaration
    {
        System.out.println("------Determining leap year------ ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  year: ");//prompt user to input
        int Y = input.nextInt();
        int F= 0;
        if(Y % 4 == F)// check if divisible by 4
        {
            if ( F % 2 == 0) //check if divisible by 2
            {
             System.out.println( "The year " + Y + " is the leap year.");//print result
            }
        }
        else
        {
            System.out.println("The year " + Y + " is not the leap year.");//print result
        }
    }
}
