/*
7.	Write a program that reads the radius and length of a cylinder and computes volume.
 */
package Assignment1;
import java.util.Scanner;//import declaration
import static java.lang.Math.*;
public class Question7 { //class definition
    public static void main(String[] args) { //main method declaration
        Scanner input = new Scanner(System.in); //input access to the user
        System.out.println("--------Volume of Cylinder-------");//display heading

        System.out.print("Enter the radius of the cylinder(r): ");//display message asking radius
        double r = input.nextDouble();// input from the user
        System.out.print("Enter the height of the cylinder(h): ");//display message asking height
        double h = input.nextDouble();// input from the user

        double Volume = (PI*pow(r,2)*h);// formula to calculate the volume
        System.out.print("The volume of the cylinder is: " +Volume);
    }
}
//end of the program