/*
36.	Write a function to find duplicate elements in an array.
 */
package Assignment1;
import java.util.Scanner;
import java.util.Arrays;

public class Question36 {

    public static void main(String[] args) //main method declaration
    {
      System.out.println("---------------Program to find the equal elements in an array.--------");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements in an array: ");
        int num = input.nextInt();//user input for array size
        array(num);
    }

    public static void array(int num)
    {
        int arr[] = new int[num]; //array definition
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < num; ++i) //for condition
        {
            System.out.println("Please enter the elements of an array: ");//display message to the user
            arr[i] = input.nextInt(); //prompt user to input
        }
        for (int i = 0; i < num; ++i)// declare variable 'i' and 'j' to evaluate position of elements in array
        {
            for (int j = i + 1; j < num; ++j)
            {
                if (arr[i] == arr[j])//check if elements are equal
                {
                    System.out.println("Duplicate elements in array are: " + arr[i]); //display result
                }
            }
        }
    }
}
//end of the program
 /*  second method:
      int[] numbers = {1,2,3,4,5,4,3,4,6,7,8,5};
        Arrays.sort(numbers);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                System.out.println("Duplicate: " + numbers[i]);
            }
        }
    }
}
*/
