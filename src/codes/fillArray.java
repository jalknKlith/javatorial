package codes;
import java.util.Scanner;

public class fillArray {
    public static void main(String[] args) {
        // Asking for the numbers
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Enter a number ");
            numbers[i] = input.nextInt();
        }//Printing the array
        for (int i = 0; i < 10; i++){
            System.out.print(numbers[i]+"|");
        }
    }
}

