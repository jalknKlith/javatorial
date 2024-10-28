package codes;
import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {
        // Asking for a number (1-7)
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number (1-7): ");
        int dayNumber = input.nextInt();
        //switch the numbers
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Error");
        }
    }
}

/*
dayNumber = int(input("Write anumber (1-7); "))

if dayNumber == 1:
	print("Monday")

*/

