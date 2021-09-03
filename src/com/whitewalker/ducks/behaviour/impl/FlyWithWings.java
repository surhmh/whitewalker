package com.whitewalker.ducks.behaviour.impl;

import com.whitewalker.ducks.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void performFly() {
        System.out.println("The Duck is flying with wings...");
    }
}
