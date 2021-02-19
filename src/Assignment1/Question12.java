package Assignment1;
import java.util.Scanner;

public class Question12 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n---------Identity Information------------");

        System.out.print("Enter your name:" );
        String N = input.nextLine();
        System.out.print("Enter the name of company:" );
        String C = input.nextLine();
        System.out.print("Enter the position: ");
        String P = input.nextLine();
        System.out.print("Enter the ID Number: ");
        int I = input.nextInt();

        System.out.println("\n---------IDENTITY CARD------------");
        System.out.println("Name: " +N);
        System.out.println("Company: " +C);
        System.out.println("Position: " +P);
        System.out.println("ID number: " +I);



    }
}
