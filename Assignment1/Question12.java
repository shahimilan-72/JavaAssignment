/*
12.	Write a program to accept the roll, name, and nationality of the person and display those values in good format.
 */
package Assignment1;
import java.util.Scanner;

public class Question12 { //class definition
    public static void main (String [] args){ //method declararion
        Scanner input = new Scanner(System.in);
        System.out.println("\n---------Identity Information------------");

        System.out.print("Enter your name:" );//prompt user to input
        String N = input.nextLine();
        System.out.print("Enter the name of company:" );
        String C = input.nextLine();
        System.out.print("Enter the position: ");
        String P = input.nextLine();
        System.out.print("Enter the ID Number: ");
        int I = input.nextInt();

        System.out.println("\n---------IDENTITY CARD------------");//print the information
        System.out.println("Name: " +N);
        System.out.println("Company: " +C);
        System.out.println("Position: " +P);
        System.out.println("ID number: " +I);



    }
}
