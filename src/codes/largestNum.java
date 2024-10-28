package codes;
import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        // Asking for three numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int n3 = input.nextInt();
        // Finding out the largest number
        int largest = n1;
        if (n2 > largest) { largest = n2;
        }if (n3 > largest) { largest = n3;
        }// Printing the largest number
        System.out.println("The largest number is: " + largest);
    }
}

/* python

n1 = int(input("Enter the first number: "))
n2 = int(input("Enter the second number: "))
n3 = int(input("Enter the third number: "))

largest = n1
if n2 > largest: largest = n2
if n3 > largest: largest = n3

print("The largest number is: ", largest)

*/

