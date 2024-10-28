package codes;
import java.util.Objects;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        // Asking for the password twice
        Scanner input = new Scanner(System.in);
        System.out.print("Write your password: ");
        String pass1 = input.nextLine();
        System.out.print("Write it again: ");
        String pass2 = input.nextLine();
        // Checking if they are equal
        while(!Objects.equals(pass1, pass2)){
            System.out.print("try again: ");
            pass2 = input.nextLine();
        }//Printing 'welcome!'
        System.out.print("Welcome!");
    }
}

/*

pass1 = input("write your password ")
pass2 = input("write it again ")
while (pass1 != pass2):
        pass2 = input("try again")
print("welcome!")


*/

