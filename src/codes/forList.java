package codes;
import java.util.ArrayList;

public class forList {
    public static void main(String[] args) {
        // Creating the array
        ArrayList<String> cars = new ArrayList<String>();
        // Adding the values
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Looping and printing the list
        for (String i : cars) {
            System.out.println(i.toUpperCase());
            System.out.println(cars.indexOf(i));
        }
    }

}
