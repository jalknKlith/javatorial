package codes;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Asking for a number and setting it
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms of the"+"\n"+
                "Fibonacci sequence you want to print: ");
        int n = input.nextInt();
        /* Initializing the first two terms of the sequence
        and setting the itinerant */
        int a = 0, b = 1;
        int i = 2;
        // Printing the aim
        System.out.print("The first " + n + " " +
                "terms of the Fibonacci"+"\n"+"sequence are: ");
        // Printing the first two numbers
        System.out.print(a + " " + b + " ");
        do { int c = a + b; // Calculating the next numbers
            System.out.print(c + " "); // Printing the numbers
            a = b; b = c; i++; // Updating the next numbers
        } while (i < n); //keeping the aim

    }
}

/* python

import sys

n = int(input("Enter the number of terms of the"+"\n"+
                "Fibonacci sequence you want to print: "))
a = 0
b = 1
i = 2

print("The first " + str(n) + " " +
                "terms of the Fibonacci"+"\n"+"sequence are: ")
print(a, b, end=" ")

while i < n:
    c = a + b
    print(c, end=" ")
    a = b
    b = c
    i += 1

 */

