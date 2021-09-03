package com.whitewalker.ducks.behaviour.impl;

import com.whitewalker.ducks.behaviour.QuackBehavior;

public class SilentQuackBehaviour implements QuackBehavior {

    @Override
    public void quack(){
        System.out.println("Duck is silent hence no noise....");
    }
}
