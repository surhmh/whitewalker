package com.whitewalker.ducks;

import com.whitewalker.ducks.behaviour.impl.DJQuackBehaviour;
import com.whitewalker.ducks.behaviour.impl.FlyWithAutomaticWings;

public class RubberDucks extends Duck{
    public RubberDucks() {
        this.duckType = Constants.DuckType.RUBBER;
        this.flyBehaviour = new FlyWithAutomaticWings();
        this.quackBehavior = new DJQuackBehaviour();
    }
}
