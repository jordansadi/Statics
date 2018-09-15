package edu.wctc.jsadi;

/**
 * This class defines a Startup, which contains three instances of the Person class and an array of those instances.
 * Created by jsadi on 9/15/2018.
 * @author Jordan Sadi
 * @version 2018 0915 .3
 */
public class Startup {
    public Startup() {}
    
    static Person jordan = new Person("Jordan", "Sadi", 28, 180);
    static Person ameerah = new Person("Ameerah", "Sadi", 25, 160);
    static Person kyle = new Person("Kyle", "Corbett", 28, 200);

    static Person[] people = new Person[] {jordan, ameerah, kyle};
}
