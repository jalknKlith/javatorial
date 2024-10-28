package codes;
import java.util.ArrayList;

public class loopList {
    public static void main(String[] args) {
        // Creating the array
        ArrayList<String> cars = new ArrayList<>();
        // Adding the values
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Making the loop
        for (int i = 0; i < cars.size(); i++) {
        // Printing the loop
            System.out.println(cars.get(i));
        }
    }
}

