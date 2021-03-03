/*18.	Write a program to display the largest number from given three values.*/
package Assignment1;
import java.util.Scanner;

public class Question18 { //class definition
    public static void main (String [] args)//method declaration
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");//prompt user to input
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int Max = (x> (y>z? y:z)?x:(y>z ? y:z )); //condition to determine maximum
        System.out.println("The maximum value is " +Max);//print result
    }
}
