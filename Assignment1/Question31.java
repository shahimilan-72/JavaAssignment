/*
31.	Write a Program display following patterns.
      1
12
123
1234
12345

 */
package Assignment1;

public class Question31 //class definition
{
    public static void main(String[] ags) //main method declaration
    {
        int y =5;
        System.out.println("-------- Result Representation----------");
        Result(y);//calling the result method

    }
    public static void Result(int y) //method declaration
    {

        int Product = 0;
        int x = 0;
        int z = 1;
        for (int i = 1; i <= y; i++) //for loop
        {
            Product = x * 10 + i;
            x = Product;
            System.out.println(Product); //result representation
        }
    }
}
//end of the program