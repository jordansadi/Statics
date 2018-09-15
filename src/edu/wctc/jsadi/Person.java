package edu.wctc.jsadi;

/**
 * This class defines a Person, which implements the Weighable interface.
 * Created by jsadi on 9/15/2018.
 * @author Jordan Sadi
 * @version 2018 0915 .3
 */
public class Person implements Weighable {
    String firstName, lastName;
    int age;
    double weight;
    static boolean alive = true;

    /**
     * This is the default constructor for the class, which instantiates a Person with no input parameters.
     */
    public Person() {}

    /**
     * This constructor instantiates a Person with a firstName, lastName, age, and weight
     * @param firstName String the first name of the Person
     * @param lastName String the last name of the Person
     * @param age int the age of the Person
     * @param weight double the weight of the person
     */
    public Person(String firstName, String lastName, int age, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    /**
     * This constructor instantiates a Person with a first name, last name, and age
     * @param firstName String the first name of the Person
     * @param lastName String the last name of the Person
     * @param age int the age of the Person
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * This constructor instantiates a Person with a first name, last name, and age
     * @param firstName String the first name of the Person
     * @param lastName String the last name of the Person
     * @param weight double the weight of the person
     */
    public Person(String firstName, String lastName, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
    }

    /**
     * This constructor instantiates a Person with a first name, age, and weight
     * @param firstName String the first name of the Person
     * @param age int the age of the Person
     * @param weight double the weight of the person
     */
    public Person(String firstName, int age, double weight) {
        this.firstName = firstName;
        this.age = age;
        this.weight = weight;
    }

    /**
     * This constructor instantiates a Person with a first name
     * @param firstName String the first name of the Person
     */
    public Person(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This constructor instantiates a Person with an age
     * @param age int the age of the Person
     */
    public Person(int age) {
        this.age = age;
    }

    /**
     * This constructor instantiates a Person with a weight
     * @param weight double the weight of the person
     */
    public Person(double weight) {
        this.weight = weight;
    }

    /**
     * This constructor instantiates a Person with a first name and last name
     * @param firstName String the first name of the Person
     * @param lastName String the last name of the Person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * This constructor instantiates a Person with a first name and age
     * @param firstName String the first name of the Person
     * @param age int the age of the Person
     */
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    /**
     * This constructor instantiates a Person with a first name and weight
     * @param firstName String the first name of the Person
     * @param weight double the weight of the person
     */
    public Person(String firstName, double weight) {
        this.firstName = firstName;
        this.weight = weight;
    }

    /**
     * This constructor instantiates a Person with an age and weight
     * @param age int the age of the Person
     * @param weight double the weight of the person
     */
    public Person(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    /**
     * This method returns whether the Person is living.
     * @return boolean whether the Person is living.
     */
    public boolean getLiving() {
        return alive;
    }

    /**
     * This method increases the weight of a Person by a specified number of pounds.
     * @param pounds the specified number of pounds to increase the weight by.
     */
    public void addWeight(double pounds) {
        weight += pounds;
    }

    /**
     * This method reduces the weight of a Person by a specified number of pounds.
     * @param pounds the specified number of pounds to reduce the weight by
     */
    public void loseWeight(double pounds) {
        weight -= pounds;
    }

    /**
     * This method returns the Weight of a Person.
     * @return double the weight of the person.
     */
    public double getWeight() {
        return weight;
    }
}
