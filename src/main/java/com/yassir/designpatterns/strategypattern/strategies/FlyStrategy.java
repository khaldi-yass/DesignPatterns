package com.yassir.designpatterns.strategypattern.strategies;

public class FlyStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("Whooof whooof!");
    }
}
