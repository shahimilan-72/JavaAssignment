package Assignment1;
import java.util.Scanner;//import declaration
import static java.lang.Math.*;
public class Question5 { //class definition
    public static void main(String []args){ //main method declaration

        Scanner input = new Scanner(System.in); //input access to the user
        System.out.println("--------Area of Circle-------");//display heading
        System.out.print("Enter the radius of the circle(r): ");//display message asking input
        double r = input.nextDouble();//user input
        double AreaOfCircle = PI*Math.pow(r,2);//formula to calculate area of circle
        System.out.println("The area of the circle is: "+ AreaOfCircle+ " square units.");//display results

        System.out.println("\n--------Area of Rectangle-------");//display heading
        System.out.print("Enter the length of the rectangle(l): ");//display message asking input
        double l = input.nextDouble(); //user input ofr length
        System.out.print("Enter the breadth of the rectangle(b): ");//display message asking input
        double b = input.nextDouble();//user input for breadth
        double AreaOfRectangle = l*b;//formula to calculate area of rectangle
        System.out.println("The area of the rectangle is: "+ AreaOfRectangle+ " square units.");//display results

        System.out.println("\n--------Area of Triangle-------");//display heading
        System.out.print("Enter the height of the triangle(h): ");//display message asking input
        double h = input.nextDouble();//user input for height
        System.out.print("Enter the base of the triangle(b): ");//display message asking input
        double x = input.nextDouble();//user input for base
        double AreaOfTriangle = (1.0/2.0)*x*h;//formula to calculate area of triangle
        System.out.println("The area of the triangle is: "+ AreaOfTriangle+ " square units.");//display results

    }
}
//end of the program