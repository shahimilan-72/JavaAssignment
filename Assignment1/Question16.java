/*16.	Write a program to find the given number is even or odd.*/
package Assignment1;
import javax.swing.*;
import java.util.Scanner;

public class Question16 //class definition
{
    public static void main (String []args) //method declaration
    {
        System.out.println("------ODD/EVEN NUMBER DETERMINATION------ ");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the  number: ");//prompt user to input
        int N = input.nextInt();

        if ( N% 2==0)
        {
            System.out.print("The number is Even");//print the result
        }
        else
        {
            System.out.print("The number is Odd");//print the result
        }
    }

}

