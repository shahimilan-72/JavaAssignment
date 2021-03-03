/*
25.	Write a program that prompts the user to enter the number of students
and each student’s name and score. Finally display the student with the
highest score.
 */
package Assignment1;
import java.util.Scanner;
import java.lang.Math.*;
public class Question25
{
    public static void main(String[] args)
    {   Scanner input = new Scanner(System.in);
        int highestscore = 0; //variable declaration
        String highestname = " ";
        System.out.println("\n-------Determining the maximum score of students -------");
        System.out.println("Enter the number of students: ");//prompting user to input
        int Number = input.nextInt();
        Maximum(Number,highestscore,highestname); //calling Maximum method
    }

    public static void Maximum(int Number, int highestscore, String  highestname) //method declaration with parameters
    {
        for (int i = 1; i <= Number; ++i)// condition to determine students count
        {
            Scanner input = new Scanner(System.in);//prompt user to input
            System.out.print("\nEnter the name of the student: ");
            String name = input.nextLine();
            System.out.println("\nEnter the score of " + name);
            int score = input.nextInt();

            if (score > highestscore) //condition to determine highest score
            {
                highestscore = score;
                highestname = name;

            }

        }
        System.out.println(highestname + " scored highest score which is " + highestscore);//print the result

    }
}