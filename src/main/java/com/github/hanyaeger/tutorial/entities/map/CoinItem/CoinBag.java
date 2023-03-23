package com.github.hanyaeger.tutorial.entities.map.CoinItem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class CoinBag extends CoinItem{

    public CoinBag(Coordinate2D coordinate2D, Size size, String file) {
        super(coordinate2D, size, file, 5);
    }

    @Override
    public int getValue() {
        return value;
    }
}
