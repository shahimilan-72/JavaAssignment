/*19.	Write a Program to accept three sides of a triangle and display which kind of triangle is formed.*/
package Assignment1;
import java.util.Scanner;

public class Question19 //class definition
{
    public static void main(String[] args)//method declaration
    {
        System.out.println("-------Determining the type of triangle--------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle:");//prompt user to input
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == b )//if--else condition
        {
            if (b == c)
            {
                System.out.println ("The triangle is equilateral triangle.");
            }
            else
            {
                System.out.println("The triangle is isosceles triangle.");

            }
        }
        else if ( b==c) {
            if (b == a) {
                System.out.println("The triangle is equilateral triangle.");
            } else {
                System.out.println("The triangle is isosceles triangle. ");

            }
        }
        else if ( c==a) {
            if (c == b) {
                System.out.println("The triangle is equilateral triangle.");
            }
            else
            {    
                System.out.println("The triangle is isosceles triangle. ");

            }
        }
        else
            {
               System.out.println("The triangle is scalene triangle.");
            }


    }

}
/*     	2nd method
	    System.out.println("----------Triangle type determination calculator------------");
		Scanner input = new Scanner (System.in);
		System.out.print("Enter x: ");
		int x = input.nextInt();
		System.out.print("Enter y: ");
		int y = input.nextInt();
		System.out.print("Enter z: ");
		int z = input.nextInt();


		if (x == y && y ==z) {
		System.out.println ("The triangle is equilateral.");
		}
		else if ( x == y && y!=z )
		{ System.out.println("The triangle is isosceles triangle.");

		}
		else if ( z == x && x!=y)
		{System.out.println("The triangle is isosceles triangle.");
		}
		else {
			System.out.println("The triangle is scalene triangle.");
		}

	}
}

 */
