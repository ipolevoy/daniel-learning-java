package data_structures;

public class House {
    private String address;

    private House nextHouse;

    public House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setNextHouse(House house){
        nextHouse = house;
    }

    public House getNextHouse() {
        return nextHouse;
    }


    @Override
    public String toString() {
        return getAddress();
    }
}
