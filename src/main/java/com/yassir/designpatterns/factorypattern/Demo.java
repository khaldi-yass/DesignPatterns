package com.yassir.designpatterns.factorypattern;

import com.yassir.designpatterns.factorypattern.factories.SpaceShipFactory;
import com.yassir.designpatterns.factorypattern.models.SpaceShip;

/**
 * Type:
 *      Creational pattern.
 * What it does:
 *      Define an interface for creating an object,
 *      but let subclasses decide which class to instantiate.
 *      Lets a class defer instantiation to subclasses.
 */
public class Demo {

    public static void main(String[] args) {

        SpaceShipFactory spaceShipFactory = new SpaceShipFactory();
        SpaceShip ship1 = spaceShipFactory.makeSpaceShip('U');
        SpaceShip ship2 = spaceShipFactory.makeSpaceShip('R');
        SpaceShip ship3 = spaceShipFactory.makeSpaceShip('B');

        doStuff(ship1);
        doStuff(ship2);
        doStuff(ship3);

    }

    static void doStuff(SpaceShip ship) {
        ship.followOtherShips();
        ship.displayShip();
        ship.fireTheTarget();
    }
}
