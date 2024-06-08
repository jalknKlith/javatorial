package codes;
import java.util.Scanner;

public class quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, remainder, quotient;
        //Asking for the numbers
        System.out.print("Enter the first number: ");
        x = sc.nextDouble();
        System.out.print("Enter the second number: ");
        y = sc.nextDouble();
        // Making operations
        quotient = x / y;
        remainder = x % y;
        //Printing the results.
        System.out.print("The quotient is: " + quotient+"\n");
        System.out.print("The remainder is: " + remainder+"\n");
    }
}

/*

x = float(input("Enter the first number: "))
y = float(input("Enter the second number: "))
quotient = x / y
remainder = x % y
print("The quotient is: ", quotient)
print("The remainder is: ", remainder)

*/


