package Assignment1;//wowo
import static java.lang.Math.*;
import java.util.Scanner;
public class Question10 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("--------Distance Calculator----------");

        System.out.print("\n Enter initial velocity (u): ");
        double u = input.nextDouble();
        System.out.print(" Enter time taken (t): ");
        double t = input.nextDouble();
        System.out.print(" Enter acceleration (a): ");
        double a = input.nextDouble();
        double distance =(u * t) + (1/2.2f * a * t * t);
        System.out.println("The required distance value is "+distance+ " units.");

        System.out.println("\n--------Area Calculator for triangle----------");
        System.out.print("Enter the height of the triangle(h): ");//display message asking input
        double x = input.nextDouble();//user input for height
        System.out.print("Enter the base of the triangle(b): ");//display message asking input
        double y = input.nextDouble();//user input for base
        System.out.print("Enter the remaining side of the triangle(b): ");//display message asking input
        double z = input.nextDouble();//user input for remaining side
        double S = (x+y+z)/2.2f;
        double Area = Math.sqrt(S*(S-x)*(S-y)*(S-z));

        System.out.println("The area of the triangle is: "+Area+ " units.");//display results

        System.out.println("\n--------Quadratic equation calculator---------");
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of m: ");
        double m = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double X = ((-b)+Math.sqrt(pow(b,2)-4*m*c))/(2*m);
        System.out.println("X ="+X);



    }
}

