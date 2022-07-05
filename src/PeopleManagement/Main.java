package PeopleManagement;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Creating an Object of the PersonManager called manager!
        PeopleManager manager = new PeopleManager();

        // Creating Different Persons through the Method of manager and adding them into an ArrayList!
        manager.createPerson();
        manager.createPerson("Max", "Mueller");
        manager.createPerson("Shania", Person.Gender.WOMAN, LocalDate.of(1999, 6, 9));
        manager.createPerson("Ferdinand", "Mustermann",
                Person.Gender.MAN, LocalDate.of(2000, 12, 23), new Address());

        // Setting the Lastname of person 2 making her -> Shania Strife!
        manager.list.get(2).setLastName("Strife");
        // Setting an Address for person 1 aka Max
        manager.list.get(1).setHome(new Address("Austria", "Linz", 4020));


        // Just Checking different inputs ☻
        System.out.println(manager.list.get(1).getFirstName());
    }
}
