/*15.	Write a program that receives an ASCII code
(between 0 – 128) and display its character
[example: 97 (input) ->a(output)].
 */
package Assignment1;
import java.util.Scanner;

public class Question15//class definition
{
    public static void main (String []args)//method declaration
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the ASCII number: ");
        int N = input.nextInt();//prompt user to input

        if ( N <= 128) //if condition to determine the limit
        {
          char B = (char) N;
          System.out.print("The corresponding character is: " +B);//print result
        }

    }

}
