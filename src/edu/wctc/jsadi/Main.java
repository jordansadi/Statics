package edu.wctc.jsadi;

public class Main {

    public static void main(String[] args) {
        Startup newSU = new Startup();

        for (Person p : newSU.people) {
            System.out.println(p.firstName + " " + p.lastName + ", age " + p.age + ", weight: " + p.getWeight() +
                    " pounds, alive: " + p.getLiving());
            Person.alive = false;
            p.loseWeight(100);
            System.out.println(p.firstName + " now weighs " + p.getWeight() + " pounds. Are they still alive? " + p.getLiving());
            p.addWeight(110);
            Person.alive = true;
            System.out.println(p.firstName + " now weighs " + p.getWeight() + " pounds");
        }
    }
}