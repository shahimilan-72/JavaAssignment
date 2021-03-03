/*28.	Write a program in a single class having the following functions.
a.	isPrimenumber(int)
b.	firstNthPrime(int )
c.	allPrimebetween(int start , int  end)
*/
package Assignment1;
import java.util.Scanner;

public class Question28 //class definition
{
    public static void main(String[] args) //main method definition
    {
        System.out.println("----------Prime Calculator----------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:    "); //prompt user to print
        int A = input.nextInt();
        Prime1(A);//calling method prime1
        Prime2(A);//calling method prime2
        Prime3();
    }

    public static void Prime1(int A) //method prime1 declaration
    {
        int sum = 0; //initialize sum =0
        for (int x = 1; x <= A; x++) //for lop initiation
        {
            if (A % x == 0) //if--else statement
            {
                sum = sum + 1;//increment of sum
            }
        }
        if (sum >= 3) // for sum value greater or equal to 3
        {
            System.out.println("\nThe number is not a prime number"); //print the result
        } else {
            System.out.println("\nThe number is a prime number");//print the result
        }
        System.out.println("\nThe list of all prime number from 1 to the " + A + "  is: ");//display message
    }

    public static void Prime2(int A) //method Prime2 declaration
    {
        for (int j = 2; j <= A; j++) // for loop initiation
        {
            int count = 0;
            for (int i = 1; i <= j; i++)// 2nd for loop
            {
                if (j % i == 0) {
                    count++;//increment of count
                }
            }
            if (count == 2) // for count value equal to 2

                System.out.println(j + "  ");// display result
        }

    }

    public static void Prime3() //Prime3 method declaration
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the upper limit of the number(U): ");//prompt user to input
        int A = input.nextInt();
        System.out.println("\nEnter the lower limit of the number(U): ");//prompt user to input
        int B = input.nextInt();

        System.out.println("\nThe prime numbers between " + A + " and " + B + " are:"); // print the result
        for (int x = A; x <= B; x++) //for loop
        {
            if (x == 1 || x == 0) continue;
            int flag = 1;
            for (int y = 2; y <= x / 2; ++y)  //condition checking
            {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(x); //print the result

        }
    }

}

