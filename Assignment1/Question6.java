/*
6.	Write a program to find the perimeter of a circle, triangle, and rectangle.
*/

package Assignment1;
import java.util.Scanner;//import declaration
import static java.lang.Math.*;
public class Question6 { //class definition
    public static void main(String []args){ //main method declaration

        Scanner input = new Scanner(System.in); //input access to the user
        System.out.println("--------Perimeter of Circle-------");//display heading
        System.out.print("Enter the radius of the circle(r): ");//display message asking input
        double r = input.nextDouble();//user input
        double PerimeterOfCircle = (2*PI*r);//formula to calculate perimeter of circle
        System.out.println("The perimeter of the circle is: "+ PerimeterOfCircle+ " units.");//display results

        System.out.println("\n--------Perimeter of Rectangle-------");//display heading
        System.out.print("Enter the length of the rectangle(l): ");//display message asking input
        double l = input.nextDouble(); //user input for length
        System.out.print("Enter the breadth of the rectangle(b): ");//display message asking input
        double b = input.nextDouble();//user input for breadth
        double PerimeterOfRectangle = 2*(l+b);//formula to calculate perimeter of rectangle
        System.out.println("The Perimeter of the rectangle is: "+ PerimeterOfRectangle+ " units.");//display results

        System.out.println("\n--------Perimeter of Triangle-------");//display heading
        System.out.print("Enter the height of the triangle(h): ");//display message asking input
        double h = input.nextDouble();//user input for height
        System.out.print("Enter the base of the triangle(b): ");//display message asking input
        double x = input.nextDouble();//user input for base
        System.out.print("Enter the remaining side of the triangle(b): ");//display message asking input
        double y = input.nextDouble();//user input for remaining side
        double PerimeterOfTriangle = h+x+y;//formula to calculate area of triangle
        System.out.println("The perimeter of the triangle is: "+ PerimeterOfTriangle+ " units.");//display results

    }

}
//end of the program