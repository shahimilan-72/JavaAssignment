/*
41.	Write a program to find the duplicate letter in a word.
 */
package Assignment1;
import java.util.Scanner;

public class Question41 { //class definition
    public static void main(String[] args)//main method declaration
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any word: ");//
        String names = input.nextLine();//prompt user to input
        name(names);

    }
    public static void name(String names)//name method
    {
        int length = names.length();//length of strings
        for(int i=0; i<length; i++)
        {
            for(int j =i+1;j<length; j++)//for loop
            {
                if(names.charAt(i) == names.charAt(j)) //comparing each characters
                {
                    System.out.println("Duplicate letters: " + names.charAt(i));//display duplicates
                }

            }
        }
    }
}
//end of the program