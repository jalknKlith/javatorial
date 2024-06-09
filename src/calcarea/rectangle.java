package calcArea;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        // Asking for the values
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        float length = input.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        float width = (float) input.nextFloat();
        // Calculating the area of a rectangle
        float area = length * width;
        // Printing the result.
        System.out.println("The area of the rectangle is: " + area);
    }
}

/*

length = float(input("Enter the length of the rectangle: "))
width = float(input("Enter the width of the rectangle: "))
area = length * width
print("The area of the rectangle is: ", area)

*/
