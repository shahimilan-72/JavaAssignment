package Assignment1;
import java.util.Scanner;

public class Question13 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("\n-----Print only negative number---------");

        System.out.print("Enter the number:  ");
        double N = input.nextDouble();

        if(N <=-1)
            System.out.println("The number " +N+ " is negative");
        else
                System.out.println("The number " +N+ " is positive");


    }
}
