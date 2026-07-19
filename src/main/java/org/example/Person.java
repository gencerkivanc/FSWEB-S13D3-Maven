package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;
    double salary;
    boolean isMarried;
    String city;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstname, String lastName, int age, double salary, boolean isMarried, String city) {
        this(firstname, lastName, age);
        this.salary = salary;
        this.isMarried = isMarried;
        this.city = city;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}