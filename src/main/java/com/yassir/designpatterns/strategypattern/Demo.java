package com.yassir.designpatterns.strategypattern;

import com.yassir.designpatterns.strategypattern.models.Person;
import com.yassir.designpatterns.strategypattern.strategies.FlyStrategy;
import com.yassir.designpatterns.strategypattern.strategies.RunStrategy;
import com.yassir.designpatterns.strategypattern.strategies.SwimStrategy;

/**
 * Type:
 *      Behavioral pattern.
 * What it does:
 *      Define a family of algorithms, encapsulate each one, and make them interchangeable.
 *      Lets the algorithm vary independently from clients that use it.
 */
public class Demo {

    public void startDemo() {
        Person person = new Person();
        person.move(); // walk by default
        person.setMovingStrategy(new RunStrategy());
        person.move(); // runs
        person.setMovingStrategy(new SwimStrategy());
        person.move(); // swimming
        person.setMovingStrategy(new FlyStrategy());
        person.move(); //flying
    }
}
