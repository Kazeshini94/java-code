package OPP1.PeopleManagement;

public class Address {
    // Variables of Class Address !
    private String land;
    private String location;
    private int postal;
    private String street;
    private String door;

    //  Constructors of Address
    Address() {
        this.land = "Austria";
        this.location = "Marchtrenk";
        this.postal = 4614;
        this.street = "Schopenhauerstrasse";
        this.door = "8";
    }
    Address(String land, String location, int postal, String street, String door) {
        this.land = land;
        this.location = location;
        this.postal = postal;
        this.street = street;
        this.door = door;
    }
    Address(String land, String location, int postal) {
        this.land = land;
        this.location = location;
        this.postal = postal;
    }

    // Setter and Getter since Variables are Private!
    public String getLand() {
        return land;
    }
    public void setLand(String land) {
        this.land = land;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public int getPostal() {
        return postal;
    }
    public void setPostal(int postal) {
        this.postal = postal;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoor() {
        return door;
    }
    public void setDoor(String door) {
        this.door = door;
    }
}
