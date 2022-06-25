package OPP1.PeopleManagement;

import java.time.LocalDate;
import java.util.*;

public class PeopleManager {

    List<Person> person = new ArrayList<>();

    // createPerson Method to fill the ArrayList!
    public void createPerson() {
        person.add(new Person());
    }
    // Overloading the Method to be able to create different Variables in the ArrayList!
    public void createPerson(String firstName, String lastName)  {
        person.add(new Person(firstName,lastName));
    }
    // Useful Info to consider !!! we declared the constructors for the overloaded methods in Class Person!!
    public void createPerson(String firstName, Person.Gender gender, LocalDate birthday)  {
        person.add(new Person(firstName, gender, birthday));
    }
    public void createPerson(String firstName, String lastName , Person.Gender gender, LocalDate birthday, Address home)  {
        person.add(new Person(firstName, lastName, gender, birthday, home));
    }
}
