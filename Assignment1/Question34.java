/*
34.	Write a program to reverse the element of an array.
 */
package Assignment1;
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) //main method decleration
    {
        System.out.println("---------------Numbers in array arranged in reversed order--------");
        int arr[] = new int[5]; //array definition
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) //for condition
        {
            System.out.println("Please enter the number: ");
            arr[i] = input.nextInt(); //prompt user to input
        }
        for (int i = 0; i < 5; ++i)// declare variable 'i' and 'j' to evaluate position of elements in array
        {
            for (int j = i + 1; j < 5; ++j)
            {
                    int swap = arr[i]; //swap position to maintain reverse order
                    arr[i] = arr[j];
                    arr[j] = swap;
            }

        }
        System.out.println("The reversed order of elements of an array is:");
        for (int i = 0; i < 4; ++i) {
            System.out.print( arr[i] + ",");
        }System.out.print( arr[4]);
    }
}