package codes;
import java.util.Scanner;

public class profit40 {
    public static void main(String[] args) {
        // Asking for the price
        Scanner sc = new Scanner(System.in);
        System.out.print("How much costs the item?: ");
        double x = sc.nextDouble();
        // Calculate the profit
        double y = x*1.4;
        System.out.print("You should sell it for: "+y+"\n");
    }
}

/*

x = int(input("how much costs the item? $"))
y = int(x * 1.4)
print("if you want to profit 40%, you have to sell it for $", y)

*/

