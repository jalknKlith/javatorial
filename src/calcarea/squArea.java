package calcArea;
import java.util.Scanner;

public class squArea {
    public static void main(String[] args) {
        // Asking for the length side
        int side, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length side");
        side = input.nextInt();
        // Calculating the area of a rectangle
        area = (int) Math.pow(side, 2);
        // Printing the result.
        System.out.println("The area of the square is: " + area);
    }
}

/* python

side = float(input("Enter the length side"))
area = side ** 2
print("The area of the square is:", area)

*/

