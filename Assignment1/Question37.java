
/*
37.	Write a Program to perform for the following task.
a.
 */
package Assignment1;
public class Question37 { //class declaration
    public static void main(String[] args) { //main method declaration
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//matrix a
        int b[][] = {{4, 5, 6}, {2, 7, 8}, {3, 1, 9}};//matrix b
        int c[][] = new int[3][3]; //matrix c

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j]); //print the result c
            }
        }

    }

}
//end of the program