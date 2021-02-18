package Assignment1;
//package declaration
import java.util.Scanner;

//class declaration
 public class Question3 {
     public static void main(String [] args){ //main method declaration
         Scanner input = new Scanner (System.in);//scanner class gives input access for user
         System.out.print("Enter the first number(a): ");//display message asking user to input
         int a = input.nextInt();//taking the input from the user
         System.out.print("Enter the second number(b): ");
         int b = input.nextInt();
         int sum = a+b; //summation formula
         double average =  (a + b) / 2.f;//average formula

         System.out.println("The sum of the numbers is: "+sum);//printing the sum
         System.out.println("The avergae of the numbers is :"+average);//printing the average

     }
 }
