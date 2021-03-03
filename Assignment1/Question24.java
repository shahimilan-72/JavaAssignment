/* 24.	Write a program to print the factorial number of given numbers.*/
//package declaration
package Assignment1;
import java.util.Scanner;
public class Question24
{
    public static void main(String[] args) //main method declaration
    {
        System.out.println("-------Factorial Calculation -------");
        System.out.println("Enter the number 1-10 :");//prompting user to input
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        Table(Number);//calling Table method

    }

    public static void Table(int Number)//defining Table method
    {
        int Factorial = 1;//initialize variable
        for (int i = 1; i <= Number; i++)//condition to determine length of iteration
        {
             Factorial =  Factorial * i;//formula to calculate factorial
        }
        System.out.println("The factorial of " + Number + " is " +Factorial );//print result

    }

}