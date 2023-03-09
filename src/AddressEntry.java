public class AddressEntry {
    private final String name;
    private Address address;
    private static int numEntries = 0;

    public AddressEntry(String addressName, Address addressAdd) {
        name = addressName;
        setAddress (addressAdd);
    }

    public AddressEntry(String street, String city, String country, String name) {
        this (name, new Address (street, city, country));
    }

    public void setAddress(int numEntries, String street, String city, String country) {
        this.setAddress (new Address (street, city, country));
    }

    public void setAddress(Address addressAdd) {
        numEntries++;
        address = addressAdd;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
@Override
    public String toString() {
        String create = "Name: " + name + address.toString () +
                "Number of Entries:" + "\t" + numEntries + "\n";

        return create;
    }

    public static int getNumEntries() {
        return numEntries;
    }
}
