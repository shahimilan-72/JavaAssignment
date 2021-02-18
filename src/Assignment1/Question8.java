package Assignment1;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------Fahrenheit to Celsius conversion----------");
        System.out.print("Enter the temperature in Fahrenheit (F): ");
        double F = input.nextDouble();
        double Celsius = (5.2f/9.2f)*F - (160.2f/9.2f);
        System.out.println( +F+ " Degree Fahrenheit equals to " +Celsius+ " Degree Celsius.");


        System.out.println("\n----------- Celsius to Fahrenheit conversion----------");
        System.out.print("Enter the temperature in Celsius (F): ");
        double C = input.nextDouble();
        double Fahrenheit  = (9.2f/5.2f)*C + (32);
        System.out.print( +C+ " Degree Celsius equals to " +Fahrenheit+ " Degree Fahrenheit.");
    }
}
