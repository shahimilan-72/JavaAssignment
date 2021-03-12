/*
43.	Write a program to trap the exception handling to trap the divided by zero and out of index value in array.
*/
package Assignment1;

public class Question43 {

    public static void main(String args[]) { //main method declaration
        try {  //try catch for arithmetic exception
            int num1 = 10, num2 = 0;
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");

        }
        try { //try catch for array exception
            int a[] = new int[10];
            //Array contains only 10 elements
            a[11] = 9; //assign 11th element as 9 which is not in the array defined above
        } catch (ArrayIndexOutOfBoundsException e) { //catch error
            System.out.println("Out of index value in array"); //display result
        }

    }
}
//end of the program
