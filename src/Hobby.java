import java.util.*;

public class Hobby implements Hobbies {

    private static String name;
    private static int frequency;
    private List locations;

    public Hobby(String name, int frequency, List locations) {
        final Hobby hobby = this;
        name = name;
        this.frequency = frequency;
        this.locations = locations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setList(List locations) {
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public static int getFrequency() {
        return frequency;
    }

    public List getLocations() {
        return locations;
    }

    // Two Persons are equal if their age is equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Hobby hobby = (Hobby) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash (frequency);
    }

    // Compare persons based on their age
    @Override
    public int compareTo(Hobby hobby) {
        return getFrequency () - Hobby.getFrequency ();
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "frequency=" + frequency +
                ", name='" + name + '\'' +
                '}';
    }

    public static <PersonFormData> Map<String, Boolean> makeHobbyMap(PersonFormData person) {
        Map<String, Boolean> hobbyMap = new HashMap<String, Boolean> ();
        for (Hobby hobby : allHobbies) {
            hobbyMap.put (hobby.getName (), person != null && hobby.contains (hobby.getName ()));
        }
        return hobbyMap;
    }

    private boolean contains(String name) {
        return false;
    }


    public static Hobby findHobby(String hobbyName) {
        for (Hobby hobby : allHobbies) {
            if (hobbyName.equals (hobby.getName ())) {
                return hobby;
            }
        }
        return null;
    }


    static List<Hobby> allHobbies = new ArrayList<Hobby> ();


    static {
        allHobbies.add (new Hobby ("Surfing", 1, Collections.singletonList ("Australia")));
        allHobbies.add (new Hobby ("Biking", 5, Collections.singletonList ("Netherlands")));
        allHobbies.add (new Hobby ("Running", 10, Collections.singletonList ("USA")));
        allHobbies.add (new Hobby ("Paddling", 6, Collections.singletonList ("Canada")));
    }


}



