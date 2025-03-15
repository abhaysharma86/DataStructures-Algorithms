package java8Features.functionalInterfaces.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReferenceInstanceMethod {

    public static void main(String[] args)
    {
        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Person> personList = new ArrayList<>();

        // Adding elements to above object
        // using add() method
        personList.add(new Person("Vicky", 24));
        personList.add(new Person("Poonam", 25));
        personList.add(new Person("Sachin", 19));

        // A comparator class with multiple
        // comparator methods
        ComparisonProvider comparator
                = new ComparisonProvider();

        // Now using instance method reference
        // to sort array by name
        Collections.sort(personList, comparator::compareByName);

        // Display message only
        System.out.println("Sort by Name :");

        // Using streams
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        System.out.println();

        // Using instance method reference
        // to sort array by age
        Collections.sort(personList, comparator::compareByAge);

        // Display message only
        System.out.println("Sort by Age :");

        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }

}

// Helper class
// Comparator class
class ComparisonProvider
{
    // To compare with name
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    // To compare with age
    public int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
}

