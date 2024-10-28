package calcArea;
import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        // Asking for the radius
        Scanner sc = new Scanner(System.in);
        double radio, area;
        System.out.println("Enter the circle radius: ");
        radio = sc.nextDouble();
        // Calculating the area
        area = Math.PI * Math.pow(radio, 2);
        //Printing the result.
        System.out.println("The area is: " + area);
    }
}

/*

import math

radius = float(input("Enter the circle radius: "))
area = math.pi * math.pow(radius, 2)
print("The area is: ", area)

*/

