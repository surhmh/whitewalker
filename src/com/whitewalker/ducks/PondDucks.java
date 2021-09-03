package com.whitewalker.ducks;

import com.whitewalker.ducks.behaviour.impl.FlyWithWings;
import com.whitewalker.ducks.behaviour.impl.SilentQuackBehaviour;

public class PondDucks extends Duck{
    public PondDucks(){
        this.duckType = Constants.DuckType.POND;
        this.flyBehaviour = new FlyWithWings();
        this.quackBehavior = new SilentQuackBehaviour();
    }
}
