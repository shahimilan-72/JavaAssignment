/*
40.	Write a program to reverse the string.
 */
package Assignment1;
import java.util.Scanner;

public class Question40 { //class definition
    public static void main(String[] args)//main method declaration
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any string: ");//display message
        String names = input.nextLine();//prompt user to input
        name(names);

    }
    public static void name(String name) //method name declaration
    {
        String reverse = new StringBuilder(name).reverse().toString();//reverse function
        System.out.println("Reversed string:  " +reverse);
    }
}
//end of the program