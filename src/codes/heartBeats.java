package codes;
import java.util.Scanner;

public class heartBeats {
    public static void main(String[] args) {
        //Asking for the age
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        //Calculating the number of pulses
        double beats = (220 - age) / 10.0;
        //Print the number of pulses
        System.out.println("The number of beats" +
                "per 10 seconds are: " + beats);
    }
}

/*

age = input("Enter your age")
beats = (220 - (age)) / 10
print("The number of beats per 10 seconds of exercise is: ", beats)


*/

