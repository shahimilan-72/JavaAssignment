/*21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.*/
package Assignment1;
import java.util.Scanner;
public class Question21 //class definition
{

    public static void main (String []args)//main method declaration

    {
        System.out.println("-------Days Calculator-------");
        System.out.println("Enter the number 1-7 :");//prompt user to input
        Scanner input = new Scanner(System.in);
        int Day = input.nextInt();
        System.out.println("The corresponding day is " + GetDays(Day));//print result

    }
    public static String GetDays(int Day)//method declaration
    {
        String dayname = "";
        switch(Day)
        {    //determine the day based on number case
            case 1:dayname = "Sunday";break;
            case 2:dayname = "Monday";break;
            case 3:dayname = "Tuesday";break;
            case 4:dayname = "Wednesday";break;
            case 5:dayname = "Thursday";break;
            case 6:dayname = "Friday";break;
            case 7:dayname = "Saturday";break;
            default:dayname = "Invalid input!!";break;
        }
        return dayname; //return the result
    }

}

