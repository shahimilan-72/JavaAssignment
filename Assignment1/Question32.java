/*
32.	Write a Program to accept 5 values in an array and display their sum.package Assignment1;
 */
package Assignment1;
import java.util.Scanner;
public class Question32
{
    public static void main(String[] args) //main method decleration
    {
        System.out.println("---------------Array sum of numbers--------");
        int arr[] = new int[5]; //array definition
        Scanner input = new Scanner(System.in);
        int sum = 0; //sum declaration
        for (int i = 0; i < 5; ++i) //for condition
        {
            System.out.println("Please enter the numbers: ");
            arr[i] = input.nextInt(); // prompt user to input
            sum = sum + arr[i]; ///array addition
        }
        System.out.println("The required sum of the array is " + sum);// display the result

    }
 }

//end of the program