package codes;
import java.util.ArrayList;
import java.util.List;


public class lists {
    public static void main(String[] args) {
        // Creating the list and adding values
        List<String> countries;
        countries= new ArrayList<String>();
        countries.add("India");
        countries.add("China");
        countries.add("Germany");
        countries.add("France");
        // Printing the list
        System.out.println("The countries taking part are: ");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
        // Printing the numbers of items
        System.out.println("They are '"+countries.size()+"'");

    }

}
