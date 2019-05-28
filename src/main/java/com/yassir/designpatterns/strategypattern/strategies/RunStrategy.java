package com.yassir.designpatterns.strategypattern.strategies;

public class RunStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("Ruuuuuuuuuuuuuun faaast!!");
    }
}
