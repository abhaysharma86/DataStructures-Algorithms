package java8Features.functionalInterfaces.methodReference;// Reference to an Instance Method of an
// Arbitrary Object of a Particular Type
import java.io.*;
import java.util.*;

public class Geeks1 
{
    public static void main(String[] args)
    {
        // Creating an empty ArrayList of user defined type
        // List of person
        List<String> personList = new ArrayList<>();

        // Adding elements to above object of List
        // using add() method
        personList.add("Vicky");
        personList.add("Poonam");
        personList.add("Sachin");

        // Method reference to String type
        Collections.sort(personList, String::compareToIgnoreCase);

        // Printing the elements(names) on console
        personList.forEach(System.out::println);
    }
}