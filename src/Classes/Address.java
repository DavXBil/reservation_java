package Classes;

public class Address {

    int streetNum;
    String streetName;
    int zipCode;
    String city;

    public Address(int streetNum, String streetName, int zipCode, String city) {
        setStreetNum(streetNum);
        setStreetName(streetName);
        setZipCode(zipCode);
        setCity(city);
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
