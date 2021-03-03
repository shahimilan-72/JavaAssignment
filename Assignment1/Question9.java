/*
9.	Write a program that converts pounds into kg. The program prompts
the user to enter a number of pounds, converts it to kg and displays
the result [1 pound is 0.454 kg].
 */
package Assignment1;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("------Pound to Kilogram conversion------");

        System.out.print("\nEnter the mass in Pound system (p):" );
        double p = input.nextDouble();
        double Kilogram = 0.454 * p;
        System.out.print(+p+ " pound equals to " +Kilogram+ " kilograms.");
    }
}
