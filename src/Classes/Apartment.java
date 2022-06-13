package Classes;

public class Apartment {

    int price;
    Address address;
    int maxCapacity;
    int floor;
    boolean onReservation = false;

    public Apartment(int price, Address address, int maxCapacity, int floor) {
        setPrice(price);
        setAddress(address);
        setMaxCapacity(maxCapacity);
        setFloor(floor);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isOnReservation() {
        return onReservation;
    }

    public void setOnReservation(boolean onReservation) {
        this.onReservation = onReservation;
    }
}
