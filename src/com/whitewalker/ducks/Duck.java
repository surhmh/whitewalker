package com.whitewalker.ducks;

import com.whitewalker.ducks.behaviour.FlyBehaviour;
import com.whitewalker.ducks.behaviour.QuackBehavior;

public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;
    Constants.DuckType duckType;

    public void fly() {
        flyBehaviour.performFly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void performAllFunctions() {
        System.out.println("Duck type: "+duckType);
        fly();
        quack();
    }
}
