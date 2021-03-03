/*
38.	Write a program to check whether a given string is palindrome or not.
 */
package Assignment1;
import java.util.Scanner;

public class Question38 //class declaration
{
    public static void main(String[] args)//main method declaration
    {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter any string: ");//
       String names = input.nextLine();//prompt user to input
       names(names);

    }
    public static void names(String names) //name method declaration
    {
        String reverse = new StringBuilder(names).reverse().toString();//reverse function
        if( names.equals(reverse ))// comparing two strings
        {
            System.out.println("The given string is palindrome");//print result
        }
        else
            {
                System.out.println("The given string is not palindrome");//print result
            }
    }

}
//end of the program