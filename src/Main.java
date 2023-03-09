import javax.swing.*;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeSet of User Defined Objects.


        SortedSet<Person> persons = new TreeSet<> ();

        // Comparator 1: TreeSet to use the compareTo() method of the Persons class to compare three persons and sort them by age
        persons.add (new Person (35, "Razvan"));
        persons.add (new Person (28, "Claudiu"));
        persons.add (new Person (38, "Mihaela"));

        System.out.println ("\nPersons (sorted based on Persons class's compareTo() function by age)");
        System.out.println (persons);

        // Comparator 2: This comparator compares the persons based on their Names
        persons = new TreeSet<> (Comparator.comparing (Person::getName));

        persons.add (new Person (35, "Razvan"));
        persons.add (new Person (28, "Claudiu"));
        persons.add (new Person (38, "Mihaela"));

        System.out.println ("\nPersons (sorted based on the Comparator by name)");
        System.out.println (persons);


        String Hobbies = new String ();
        String Hobby = new String ();
        persons.add (new Person (22, "Cristi"));

        Hobby (new Hobby ("Surfing", 1, Collections.singletonList ("Australia")));
        Hobby (new Hobby ("Biking", 5, Collections.singletonList ("Netherlands")));
        Hobby (new Hobby ("Running", 10, Collections.singletonList ("USA")));
        Hobby (new Hobby ("Paddling", 6, Collections.singletonList ("Canada")));

        System.out.println ("\nPersons + Hobby");
        System.out.println (persons + Hobbies);


    }


    private static void Hobby(Hobby hobby) {
    }

    FileInputStream inputStream = null;

    Address getAddress() {
        try {
            String choice = " ";
            while (!(choice.equalsIgnoreCase ("x"))) {
                JOptionPane JOptionPane = null;
                String name = JOptionPane.showInputDialog
                        ("Enter a Name: ");
                String street = JOptionPane.showInputDialog
                        ("Enter Street Address: ");
                String city = JOptionPane.showInputDialog
                        ("Enter City: ");
                String country = JOptionPane.showInputDialog
                        ("Enter Country: ");
                Address create = new Address (street, city, country);
                String message = create + "Press Enter to continue or 'x' to exit:";
                choice = JOptionPane.showInputDialog (null, message, "Cristi", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (NullPointerException e) {

        }


        return null;
    }
}

