package com.whitewalker.ducks;

public class DuckFactory {
    public static Duck getDuck(Constants.DuckType duckType) {
        switch (duckType) {
            case POND:
                return new PondDucks();
            case RUBBER:
                return new RubberDucks();
            default:
                return new PondDucks();
        }
    }
}
