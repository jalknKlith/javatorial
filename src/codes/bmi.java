package codes;
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        // Asking for the values
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kgs: ");
        double weight = input.nextDouble();
        System.out.println("Enter your height in mts: ");
        double height = input.nextDouble();
        // Calculating the bmi
        int bmi = (int) (weight / Math.pow(height,2));
        // Finding the level of body mass index
        if (bmi <= 18.5) {
            System.out.println("Your body mass index is "
                    +bmi+ "\n"+"and your weight is too low");
        }else if (bmi >= 18 && bmi <= 25) {
            System.out.println("Your body mass index is "
                    +bmi+ "\n"+"and your weight is normal");
        }else {
            System.out.println("Your body mass index is "
                    +bmi+ "\n"+"and you are overweight");
        }
    }
}

/*

w = int(input("write your weight: "))
h = float(input("how tall are you in meters? "))
bmi = (w / pow(h, 2))

if (bmi < 18):
    print("your BMI(body mass index) is", x,
            "and your weight is too low")
elif (bmi > 18 and bmi < 25):
    print("your BMI(body mass index) is", x,
            "and your weight is normal")
else:
    print("your BMI(body mass index) is", x,
            "and you are overweight")

*/