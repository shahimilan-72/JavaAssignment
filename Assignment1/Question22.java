/*22.	Write a program to print the table of given numbers.*/
package Assignment1;
import java.util.Scanner;
public class Question22
{
    public static void main(String[] args)//method declaration
    {
        System.out.println("-------Multiplication table-------");
        System.out.println("Enter the number 1-10 :");//prompt user to input
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        Table(Number);//method calling

    }

    public static void Table(int Number)//method definition
    {
        for (int i = 1; i <= 10; i++)//condition to determine the table length
        {
            int Product =  Number * i;//formula to calculate product
            System.out.println(i+ " * " + Number + " = " +Product );//print result
        }

    }

}