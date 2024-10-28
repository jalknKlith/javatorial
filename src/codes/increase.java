package codes;
// Calculating the new salary of an employee
// if the increase is 25% over their previous salary
import java.util.Scanner;

public class increase {
    public static void main(String[] args) {
        // Asking for the previous salary
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the previous salary: ");
        double prevSalary = input.nextDouble();
        // Calculate the 25%
        double increase = prevSalary * 0.25;
        // Calculating the new salary
        double newSalary = prevSalary + increase;
        // Printing the new salary
        System.out.println("The new salary is: " + newSalary);
    }
}

/*

prevSalary = int(input("Entre previous salary: "))
increase = prevSalary * 0.25
newSalary = prevSalary + increase
print("The new salary is: ", newSalary)


*/
