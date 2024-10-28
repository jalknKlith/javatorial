package codes;
import java.util.Scanner;

public class productPay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Asking for the price and the term
        System.out.print("Enter the price of the product: ");
        double price = input.nextDouble();
        System.out.print("Enter the term(months) to pay: ");
        int time = input.nextInt();
        //calculating the monthly payment and the total
        double monthlyPay = price / time;
        double total = monthlyPay * time;
        //printing the results
        System.out.println("The monthly payment is: " +
                monthlyPay + " €");
        System.out.println("The total to pay after " +
                time + " months is: " + total + " €");
    }
}

/*
Enter the price of the product: 320
Enter the term(months) to pay: 12
The monthly payment is: 26.666666666666668 €
The total to pay after 12 months is: 320.0 €
 */
