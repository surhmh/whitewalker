package com.whitewalker.ducks.behaviour.impl;

import com.whitewalker.ducks.behaviour.QuackBehavior;

public class DJQuackBehaviour implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is making a lot of noise");
    }
}
