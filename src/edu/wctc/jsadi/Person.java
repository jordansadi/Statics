package edu.wctc.jsadi;

public class Person implements Weighable {
    String firstName, lastName;
    int age;
    double weight;
    static boolean alive = true;

    public Person() {}

    public Person(String firstName, String lastName, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
    }

    public Person(String firstName, int age, double weight) {
        this.firstName = firstName;
        this.age = age;
        this.weight = weight;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(double weight) {
        this.weight = weight;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public Person(String firstName, double weight) {
        this.firstName = firstName;
        this.weight = weight;
    }

    public Person(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public boolean getLiving() {
        return alive;
    }

    public void addWeight(double pounds) {
        weight += pounds;
    }

    public void loseWeight(double pounds) {
        weight -= pounds;
    }

    public double getWeight() {
        return weight;
    }
}
