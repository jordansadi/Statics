package edu.wctc.jsadi;

/**
 * This interface is implemented by the Person class and adds methods to increase or decrease the Person's weight.
 * Created by jsadi on 9/15/2018.
 * @author Jordan Sadi
 * @version 2018 0915 .3
 */
public interface Weighable {
    void addWeight(double pounds);
    void loseWeight(double pounds);
}
