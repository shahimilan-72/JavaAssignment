/*
35.	Write a function to find the second largest number in a given array.
 */
package Assignment1;
import java.util.Arrays;
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) //main method declaration
    {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------Display the second largest number in an array--------");//display heading
        System.out.println("Please enter the number of elements in an array: ");
        int num = input.nextInt();//user input for array size
        int arr[] = new int[num];
        for (int i = 0; i < num; ++i)//for condition
        {
            System.out.println("Please enter the number: ");
            arr[i] = input.nextInt(); //prompt user to input
        }
        Arrays.sort(arr);
        System.out.println("The second largest number is:" + arr[num - 2]);
    }
}


       // array(num);


   /* public static void array(int num)//array method declaration
    {
        int arr[] = new int[num];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < num; ++i)//for condition
        {
            System.out.println("Please enter the number: ");
            arr[i] = input.nextInt(); //prompt user to input
        }
        for (int i = 0; i < num; ++i)// declare variable 'i' and 'j' to evaluate position of elements in array
        {
            for (int j = i + 1; j < num; ++j)
            {
                if (arr[i] > arr[j]) //comparing elements
                {
                    int swap = arr[i]; //swap position to maintain ascending order
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }

        System.out.println("The second largest number is:" + arr[num - 2]);//display the result
    }
}*/

//end of the program
