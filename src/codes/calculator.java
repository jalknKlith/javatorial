package codes;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Asking for the first and second number
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the first number: ");
        double x = sc.nextDouble();
        System.out.print("Write the second number: ");
        double y = sc.nextDouble();
        // asking for the operator
        System.out.print("Choose an operator: +, -, *, / ");
        String z = sc.next();
        // operation
        switch(z) {
            case "+" -> System.out.println(x+y);
            case "-" -> System.out.println(x-y);
            case "*" -> System.out.println(x*y);
            case "/" -> System.out.println(x/y);
        };
    }
}

/* python
x = int(input("Write the first number: "))
y = int(input("Write the second number: "))
z = input("Choose and operator: +, -, * , / ")

if z == "+":print(x+y)
elif z == "-":print(x-y)
elif z == "*":print(x*y)
elif z == "/":print(x/y)
else: print("wrong choice")
*/

