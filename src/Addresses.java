public class Addresses {

    private String street;
    private String city;
    private String country;


    public void Address(String addressStreet, String addressCity, String addressCountry) {
        street = addressStreet;
        city = addressCity;
        country = addressCountry;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public String getCountry() {
        return country;
    }

@Override
    public String toString() {
        return "Address: \n" +
                street + "\n" +
                city + "," + country + "\n" + "\t\t\t";

    }
}

