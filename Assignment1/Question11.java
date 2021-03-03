/*
11.	Write a program to swap two numbers
a) using temp variable
b) without temp variable

 */
package Assignment1;

public class Question11 {
    public static void main (String [] args){
        System.out.println("--------Swap using temp----------");
        int temp;
        int x= 50;
        int y = 100;

        temp =x;
        x = y;
        y = temp;

        System.out.println("X = " +x+ " Y =" +y );

        System.out.println("--------Swap without using temp----------");
        int a = 10, b = 5;

        // Code to swap 'a' and 'b'
        a = a + b; // a now becomes 15
        b = a - b; // b becomes 10
        a = a - b; // a becomes 5
        System.out.println("A = " +a+ " B =" +b );
    }
}
