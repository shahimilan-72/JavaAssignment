/*20.Write a program to create the equivalent of a four-function calculator.
The program to enter two integer’s numbers and an operator. It then carries
out the specified arithmetic operator
operation: addition, subtraction, multiplication or division of the
two numbers. Finally, it displays the result.
 */
package Assignment1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Question20
{
    public static void main (String [] args) //class definition
    {
        System.out.println("---------Arithmetic calculator-----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers a and b: ");//prompt user to input
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Enter the operation you want to perform");//prompt user to input
        char Operation = input.next().charAt(0);

        switch(Operation) //switch case to check different condition
        {
            case '+':
            {
                int Sum = a + b;
                System.out.println("The required sum of " + a + " and " + b + " is " + Sum);
                break;
            }

            case '-':
            {
                int Difference = a - b;
                System.out.println("The required difference of " + a + " and " + b + " is " + Difference);
                break;
            }

            case '*':
            {
                int Product = a * b;
                System.out.println("The required product of " + a + " and " + b + " is " + Product);
                break;
            }

            case '/':
            {
                int Division = a / b;
                System.out.println("The required division of " + a + " and " + b + " is " + Division);//print result
                break;
            }


        }

    }
}
