package OPP1.PeopleManagement;

public class Address {
    private String land = "Austria";
    private String location = "Marchtrenk";
    private int postal = 4614;
    private String street = "Schopenhauerstrasse";
    private String door = "8a";


//    Address() {
//        this.land = "Austria";
//        this.location = "Marchtrenk";
//        this.postal = 4614;
//        this.street = "Schopenhauerstrasse";
//        this.door = "8";
//    }
    // From the code above to the basic constructor below !  What's different!?
    Address() {
    }

    Address(String location, int postal) {
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
