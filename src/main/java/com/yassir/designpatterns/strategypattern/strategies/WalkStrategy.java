package com.yassir.designpatterns.strategypattern.strategies;

public class WalkStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("Tok Tok Tok!");
    }
}
