package com.whitewalker;

import com.whitewalker.ducks.Constants;
import com.whitewalker.ducks.Duck;
import com.whitewalker.ducks.DuckFactory;

public class Main {

    public static void main(String[] args) {
        Duck duck = DuckFactory.getDuck(Constants.DuckType.POND);
        duck.performAllFunctions();
        duck = DuckFactory.getDuck(Constants.DuckType.RUBBER);
        duck.performAllFunctions();
    }
}
