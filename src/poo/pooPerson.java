package poo;
import classOnes.Person;

public class pooPerson {
    public static void main(String[] args) {
        //person1 values
        Person person1;
        person1 = new Person();
        person1.setId("335566");
        person1.setName("Ana");
        person1.setSurname("Steward");
        person1.setPhone("3017624398");
        person1.setEmail("anastew@gmail.com");
        person1.setAddress("90 Street");
        person1.setAge(16);
        //person2 values
        Person person2;
        person2 = new Person();
        person2.setId("335567");
        person2.setName("Sara");
        person2.setSurname("Williams");
        person2.setPhone("3027627322");
        person2.setEmail("sarawill@gmail.com");
        person2.setAddress("11 Street");
        person2.setAge(18);
        //Printing person1 values
        System.out.println("\n"+"ARTIST 1");
        System.out.println("-------------------------------");
        System.out.println("ID Person: " + person1.getId());
        System.out.println("NAME: " + person1.getName());
        System.out.println("SURNAME: " + person1.getSurname());
        System.out.println("EMAIL: " + person1.getEmail());
        System.out.println("ADDRESS: " + person1.getAddress());
        person1.validateAge();
        System.out.println(person1.validateGender("F"));
        System.out.println("-------------------------------");
        //Printing person2 values
        System.out.println("\n"+"ARTIST 2");
        System.out.println("-------------------------------");
        System.out.println("ID Person: " + person2.getId());
        System.out.println("NAME: " + person2.getName());
        System.out.println("SURNAME: " + person2.getSurname());
        System.out.println("EMAIL: " + person2.getEmail());
        System.out.println("ADDRESS: " + person2.getAddress());
        person2.validateAge();
        System.out.println(person2.validateGender("F"));
        System.out.println("-------------------------------");
    }
}

/*
from classOnes.Person import Person

def pooPerson():
    #Adding values
    person1 = Person()
    person1.setId("335566")
    person1.setName("John")
    person1.setSurname("Steward")
    person1.setPhone("3017624398")
    person1.setEmail("johnstew@gmail.com")
    person1.setAddress("Street 80")
    person1.setAge(16)
    #Printing the values
    print("\n"+"PERSON'S VALUES")
    print("-------------------------------")
    print("ID Person: " + person1.getId())
    print("NAME: " + person1.getName())
    print("SURNAME: " + person1.getSurname())
    print("EMAIL: " + person1.getEmail())
    print("ADDRESS: " + person1.getAddress())
    person1.validateAge()
    print(person1.validateGender("M"))
    print("-------------------------------")
 */

