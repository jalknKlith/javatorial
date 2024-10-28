package maths;
import java.util.Scanner;

public class multiplyFor {
    public static void main(String[] args) {
        // Asking for number to generate the multiplication
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number: ");
        int number = sc.nextInt();
        // Generating the multiplication
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

/* python

number = int(input("Write a number: "))
for i in range(10):
	print(number, " x ", i, " = ", (number * i))

*/

