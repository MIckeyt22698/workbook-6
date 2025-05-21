package com.pluralsight.streams;

import com.pluralsight.streams.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Dana", "Wyatt", 63));
        people.add(new Person("Zachary", "Westly", 31));
        people.add(new Person("Elisha", "Aslan", 14));
        people.add(new Person("Ian", "Auston", 16));
        people.add(new Person("Zephaniah", "Hughes", 9));
        people.add(new Person("Ezra", "Aiden", 17));
        people.add(new Person("Mickey", "Teke", 63));
        people.add(new Person("Nick", "Pat", 31));
        people.add(new Person("Eunice", "Man", 14));
        people.add(new Person("Craig", "Mkeach", 16));

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people);  // uses compareTo internally

        String lastname = "Teke";
        List<Person> matchingPerson = new ArrayList<>();

        for (Person person : people) {
            if (person.getLastName().equals(lastname))
                matchingPerson.add(person);
        }


        System.out.println("\nAfter sorting by last name:");
        for (Person person : matchingPerson) {
            System.out.println(person);
        }

        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = totalAge/ people.size();
        System.out.println("Average age: " + averageAge);
    }
}


