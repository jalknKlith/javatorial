package codes;
import java.util.Scanner;

public class doubleTriple {
    public static void main(String[] args) {
        // Asking and storing the 10 numbers
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter 10 numbers: "+"\n");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        } // Looping even(x2) or odd(x3)
        System.out.println("\n"+"Doubled or tripled numbers: "+"\n");
        for (int number : num) {
            if (number % 2 == 0) {
                System.out.println(number+"X2="+number * 2);
            } else {
                System.out.println(number+"X3="+number * 3);
            }
        }
    }
}

/*
Enter 10 integer numbers:
29 | 90 | 45 | 76 | 98 | 12 | 43 | 86 | 12 | 14
Doubled or tripled numbers:
87 | 180 | 135 | 152 | 196 | 24 | 129 | 172 | 24 | 28 |
 */