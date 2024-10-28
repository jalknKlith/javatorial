package codes;
import java.util.Random;
import java.util.Scanner;

public class guessNum {

    public static void main(String[] args) {
        /* Generating a random number from 1 to 10.
        and setting the tries and the user's number input */
        Random rnm = new Random();
        int guessNum = rnm.nextInt(10) + 1;
        int tries = 3;
        Scanner input = new Scanner(System.in);
        int num;
        // Looping Do-while, asking to guess the number.
        do { System.out.println("Enter a number from 1 to 10: ");
            num = input.nextInt();
            if (num > guessNum) {//Checking if the num is lower
                System.out.println("The number to guess is lower.");
            } else if (num < guessNum) {//unless the num is greater
                System.out.println("The number to guess is higher.");
            } // Counting the numbers of tries.
            tries--;
        } while (num != guessNum && tries > 0);
        // Printing the result.
        if (num == guessNum) {
            System.out.println("Y O U  W I N!"+"\n"+"It took you " +
                    (3 - tries) + " tries.");
        } else {
            System.out.println("G A M E  O V E R"+"\n"+
                    " The number to guess was " + guessNum);
        }
    }
}

/* python

import random

guessNum = random.randint(1,10)
tries = 3
num = 0

while num != guessNum and tries > 0:
	num =int(input("Enter a number from 1 to 10: "))

	if num > guessNum:
		print("The number is lower. ")

	elif num < guessNum:
		print("The number is higher. ")

	tries -= 1

if num == guessNum:
	print("¡Y O U  W I N! with", (3 - tries), "tries.")
else:
	print("G A M E  O V E R. The number to guess was ",  guessNum)

*/

