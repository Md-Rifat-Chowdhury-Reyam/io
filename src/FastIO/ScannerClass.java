package FastIO;

import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("n : "); //read number of input
        int n = scan.nextInt();

        System.out.println("k : "); //read divisor
        int k = scan.nextInt();

        //initialize count
        int c = 0; //Initializes a counter c to 0 (this will keep track of divisible numbers)

        while (n-- > 0) //Uses a while loop that runs exactly n times (using the post-decrement operator n--)
        {
            System.out.println("x : ");
            int x = scan.nextInt(); //Prompts for and reads an integer x
            if(x % k == 0) //Checks if x is divisible by k (using x % k == 0)
            {
                    c++; //If divisible, increments the counter c
            }
        }
        System.out.println(c); //After processing all numbers, prints the count of divisible numbers
    }

}
