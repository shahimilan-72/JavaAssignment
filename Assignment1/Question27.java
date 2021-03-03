/*
27.	Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6
*/

package Assignment1;
import org.w3c.dom.ls.LSOutput;


import java.util.Scanner;

public class Question27 //class definition
{
    public static void main(String[] args)//main method declaration
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number (A)= ");//prompt user to input
        int A = input.nextInt();
        Sum(A);//method calling
        Product(A);
    }

    public static void Sum(int A) { //sum method declaration
        int sum = 0;
        while (A != 0) {
            int lastdigit = A % 10;
            sum = sum + lastdigit;//formula to calculate the sum
            A = A / 10;
        }
        System.out.println("The required sum of the individual numbers is " + sum);//display result

    }

    public static void Product(int A) {// Product method declaration
        int product = 1;
        while (A != 0) {
            int LastDigit = A % 10;
            product = product * LastDigit;//product formula
            A = A / 10;
        }
        System.out.println("The required product of the individual numbers is " + product);//display the result
    }
}
//end of the program