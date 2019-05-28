package com.yassir.designpatterns.factorypattern.models;

public abstract class SpaceShip {

    public String name;
    public int damage;

    public void followOtherShips() {
        System.out.println(name + " is following the other ships.");
    }

    public void displayShip() {
        System.out.println(name + " is on the screen.");
    }

    public void fireTheTarget() {
        System.out.println(name + " attacks and does " + damage + " damage.");
    }
}
