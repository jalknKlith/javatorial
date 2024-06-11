package codes;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // Asking for a word and storing it
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = input.nextLine();
        // Setting it reversed
        String reversed = new StringBuilder(text).reverse().toString();
        // Comparing and printing the result.
        if (text.equals(reversed)) {
            System.out.println("The word '" +text+ "' is a palindrome.");
        } else {
            System.out.println("The word '" +text+ "' is not a palindrome.");
        }
    }
}
/*
word = input("Enter a word: ")
reversed = text[::-1]
if word == reversed:
    print("The word '{}' is a palindrome.".format(text))
else:
    print("The word '{}' is not a palindrome.".format(text))
 */
