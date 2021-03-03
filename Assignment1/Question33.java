/*33.
Write a Program to display numbers in ascending order in array.
 */
package Assignment1;
import java.util.Scanner;

public class Question33
{
    public static void main (String [] args) //main method decleration
    {
        System.out.println("---------------Numbers in array arranged in ascending order--------");
        int arr[] = new int[5]; //array definition
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        for (int i=0; i<5; ++i) //for condition
        {
            arr[i] = input.nextInt(); //prompt user to input
        }
        for (int i=0; i<5; ++i)// declare variable 'i' and 'j' to compare elements in array
        {
            for(int j=i+1; j<5; ++j)
            {
                if (arr[i] > arr[j])
                {
                    int swap = arr[i]; //swap position to maintain ascending order
                    arr[i] = arr[j];
                    arr[j] = swap;

                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i <4; i++)
        {
            System.out.print(arr[i] + ", ");//print result in ascending order
        }
        System.out.print(arr[4]);
    }
}
//end of the program