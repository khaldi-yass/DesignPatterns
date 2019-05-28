package com.yassir.designpatterns.strategypattern.strategies;

public class SwimStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("Splaaash!");
    }
}
