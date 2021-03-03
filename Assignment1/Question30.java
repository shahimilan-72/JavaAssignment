package Assignment1;
import java.lang.Math.*;
import java.util.Scanner;

public class Question30
{

    public static void main(String[] args) //main method definition
  /* {
        int y =10;
        System.out.println("----------Fibonacci Representation----------");
        System.out.println("The Fibonacci numbers are:");
        Fibonacci(y);

    }
    public void  Fibonacci(int y)
    {

        int sum = 0;
        int x = 1;
        int z = 0;

        for (int i = 0; i<= y; i++ )
        {
             sum  = x + z;
             x = z;
             z = sum;

             System.out.println(sum +  "  ");
        }

    }
}*/
    {
        int x = 0;
        int y =1;

        int z =10;
        int i = 1;
        System.out.println("The fibonacci number are:");

        while(i<=z) {

          int sum = x + y;
              x = y;
              y = sum;
            System.out.println("1" + sum);
            ++i;


        }
    }
}

