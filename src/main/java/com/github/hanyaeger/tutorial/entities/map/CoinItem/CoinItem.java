package com.github.hanyaeger.tutorial.entities.map.CoinItem;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class CoinItem extends SpriteEntity implements Collider {

    protected int value;

    public CoinItem(Coordinate2D coordinate2D, Size size, String file, int value) {
        super(file, coordinate2D, size);
        this.value = value;
    };

    public abstract int getValue();
}
