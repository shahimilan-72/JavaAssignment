package Assignment1;
import java.util.Scanner;
import java.lang.Math.*;

public class Question29 //class definition
{
    public static void main(String[] args) //main method definition
    {
        System.out.println("----------Special Calculator----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:    "); //prompt user to print
        int A = input.nextInt();
        Special(A); //method calling

    }

    public static void Special(int A) //method definition
    {

        double factorial = 1; //variable declaration
        double sum1 = 1;
        for (int i = 2; i <= A; ++i) //for condition
        {
            factorial = factorial * i;
            sum1 = sum1 + ( (i/ factorial));// formula to calculate sum
        }
        double result = sum1;
        System.out.println("The required final result after calculation is :" +result); //display result

    }
}
//end of the program