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
