import Classes.Address;
import Classes.Apartment;

import java.util.ArrayList;
import java.util.Collection;

public class home {

    public static void main(String[] args) {

        ArrayList<Apartment> apartments = new ArrayList<Apartment>();

        apartments.add(new Apartment(20, new Address(11, "rue de la mouette", 56000, "Melun"), 4, 1));
        apartments.add(new Apartment(30, new Address(11, "rue de la balancoire", 54000, "Toulouse"), 3, 2));
        apartments.add(new Apartment(20, new Address(11, "rue de la mouette", 56000, "Nantes"), 4, 1));
        apartments.add(new Apartment(20, new Address(11, "rue de la mouette", 56000, "Poitiers"), 4, 1));
        apartments.add(new Apartment(50, new Address(11, "rue de la mouette", 56000, "Rezé"), 4, 1));
        apartments.add(new Apartment(20, new Address(11, "rue de la mouette", 56000, "Brest"), 4, 1));


        for (Apartment apartment : apartments) {

            Address apartmentAddress = apartment.getAddress();

            System.out.println();
            System.out.println("Addresse :" + apartmentAddress.getStreetNum() + " " + apartmentAddress.getStreetName() + " " + apartmentAddress.getCity());
            System.out.println(apartment.getFloor() + "ème étage");
            System.out.println(apartment.getMaxCapacity());
            System.out.println(apartment.getPrice() + "€");
            System.out.println("*_______________________*");

        }


    }
}
