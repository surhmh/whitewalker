package com.whitewalker.ducks.behaviour.impl;

import com.whitewalker.ducks.behaviour.FlyBehaviour;

public class FlyWithAutomaticWings implements FlyBehaviour {
    @Override
    public void performFly() {
        System.out.println("Duck is flying with Artificial wings.....");
    }
}
