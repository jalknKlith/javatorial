package classOnes;

public class House {
    // ATTRIBUTE
    public int id;
    public String city;
    public String address;
    public int rooms;
    public int floors;
    public int baths;
    public int kitchens;

    //CONSTRUCTOR
    public House() {}

    //GETTERS
    public int getId() {
        return id;
    }
    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
    public int getRooms() {
        return rooms;
    }
    public int getFloors() {
        return floors;
    }
    public int getBaths() {
        return baths;
    }
    public int getKitchens() {
        return kitchens;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setBaths(int baths) {
        this.baths = baths;
    }
    public void setKitchens(int kitchens) {
        this.kitchens = kitchens;
    }
    //METHOD WITHOUT RETURN
    public void showHouse() {
        System.out.println("The house '" + this.id + "'" + "\n" +
                "is located in '" + this.address + "'" + "\n" +
                "and it has " + this.rooms + " rooms");
    }
}
