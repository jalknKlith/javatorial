package codes;
import java.util.ArrayList;

public class newList {
    public static void main(String[] args) {
        // Creating the array <String><Integer><Double>
        ArrayList<String> brandList =
                new ArrayList<String>();
        // Adding the values
        brandList.add("Volvo");
        brandList.add("BMW");
        brandList.add("Ford");
        brandList.add("Mazda");
        brandList.add("Honda");
        brandList.add("Audi");
        brandList.add("Ferrari");
        brandList.add("Suzuki");
        // Printing the array
        System.out.println(brandList);
    }
}

/*python

import array
cars = array.array('u', ['Volvo', 'BMW', 'Ford', 'Mazda'])
print(cars)

another way

cars = ['Volvo', 'BMW', 'Ford', 'Mazda']
brandList = array.array('u', cars)
print(brandList)

 */