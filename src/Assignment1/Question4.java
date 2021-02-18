package Assignment1;
//package declaration
import java.util.Scanner;
public class Question4 {  //class declaration
    public static void main(String[] args){ //main method declaration
        Scanner input = new Scanner(System.in);//input access to the user
        System.out.print("Enter the principle(p): ");//display message asking user to input
        double p = input.nextDouble(); // assigning input value to the variable
        System.out.print("Enter the Time period in years(t): ");
        double t = input.nextDouble();
        System.out.print("Enter the rate in %(r): ");
        double r = input.nextDouble();
        double SimpleInterest = (p*t*r)/100;//formula to calculate simple interest
        System.out.print("The amount for simple interest is: "+SimpleInterest);//display the amount for simple interest

    }

}
