package codes;

import java.util.ArrayList;

public class itemsList {
    public static void main(String[] args) {
        // Creating the array
        ArrayList<String> cars = new ArrayList<>();
        // Filling the values
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // Printing the second one, 0:1,1:2,2:3,3:4
        System.out.println(cars.get(3));
        cars.remove(3);
        System.out.println("----------------------");
        System.out.println(cars);
        System.out.println(cars);
        System.out.println(cars.size());
        if (cars.contains("Ford")) {
            System.out.println("There's a Ford");
        }
        cars.clear();
        System.out.println(cars);
    }
}

