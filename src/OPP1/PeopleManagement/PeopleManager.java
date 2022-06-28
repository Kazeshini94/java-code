package OPP1.PeopleManagement;

import java.time.LocalDate;
import java.util.*;

public class PeopleManager {

    List<Person> list = new ArrayList<>();

    // createPerson Method to fill the ArrayList!
    public void createPerson() {
        list.add(new Person());
    }
    // Overloading the Method to be able to create different Variables in the ArrayList!
    public void createPerson(String firstName, String lastName)  {
        list.add(new Person(firstName,lastName));
    }
    // Useful Info to consider !!! we declared the constructors for the overloaded methods in Class Person!!
    public void createPerson(String firstName, Person.Gender gender, LocalDate birthday)  {
        list.add(new Person(firstName, gender, birthday));
    }
    public void createPerson(String firstName, String lastName , Person.Gender gender, LocalDate birthday, Address home)  {
        list.add(new Person(firstName, lastName, gender, birthday, home));
    }
    // Method to Clear the whole List
    public void delete() {
        list.clear();
    }
    // Method to delete Person through index !
    public void deletePerson(int index) {
        list.remove(index);
    }
}
