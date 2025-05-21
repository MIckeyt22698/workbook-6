package com.pluralsight.streams.model;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Implement compareTo to sort by last name
    @Override
    public int compareTo(Person other) {
        return this.lastName.compareToIgnoreCase(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}
