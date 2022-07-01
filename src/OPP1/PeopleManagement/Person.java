package PeopleManagement;

import java.time.LocalDate;

public class Person {
    // Variables of Class Person!
    private String firstName;
    private LocalDate birthday;
    private String lastName;
    private Gender gender;
    private Address home;

    // Enums are like Classes !
    public enum Gender {
        MAN,
        WOMAN;
    }
    // Basic Constructor of Person!
    public Person() {
        this.firstName = "Dominik";;
        this.lastName = "Huemer";;
        this.gender = Gender.MAN;
        this.birthday = LocalDate.of(1994,11,3);
        this.home = new Address();
    }
    // Overloading the Constructor!
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName, Gender gender , LocalDate birthday) {
        this.firstName = firstName;
        this.gender = gender;
        this.birthday = birthday;
    }

    Person(String firstName, String lastName, Gender gender, LocalDate birthday, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.home = home;
    }

    // Setters & Getters to be able to read and write to the variables!
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getHome() {
        return home;
    }
    public void setHome(Address home) {
        this.home = home;
    }
}
