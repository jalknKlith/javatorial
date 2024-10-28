package codes;

import java.util.Scanner;

public class fillArray {
    public static void main(String[] args) {
        // Asking for a number
        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Enter a number ");
            numeros[i] = input.nextInt();
        }//Printing array
        for (int i = 0; i < 10; i++){
            System.out.print(numeros[i]+"|");
        }
    }
}

