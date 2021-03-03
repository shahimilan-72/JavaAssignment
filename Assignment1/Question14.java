/*
14.	Write a program to relate two integers entered
by the user using = =or > or < sign.
*/
package Assignment1;
import java.util.Scanner;

public class Question14 //class definition
{
    public static void main(String [] args)//main method declaration
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number (A)= ");//prompt user to input
        int A = input.nextInt();
        System.out.println("Enter the number (B)= ");
        int B = input.nextInt();

        if (A>B) //if--else condition
            {
            System.out.print("A is greater than B");
            }
        else if (B>A)
            {
            System.out.print("B is greater than A");
            }
        else if (A==B) {
            System.out.println("A is equals to B");
            }
        else
            {
             System.out.println("Invalid Entry!!!!!!!");
            }

    }
}
