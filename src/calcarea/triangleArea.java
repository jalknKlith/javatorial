package calcArea;
import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        // Asking for
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        float base = input.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        float height = input.nextFloat();
        //calculating the area
        float area = base * height / 2f;
        System.out.println("The area is: "+area);
    }
}

/*
base = float(input("Enter the base of the triangle: "));
height = float(input("Enter the height of the triangle: "));
area = (base * height) / 2
print("The area is:",area)

*/