package com.github.hanyaeger.tutorial.entities.map.Interactable.Items;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.map.Interactable.Interactable;

public abstract class CoinItem extends PickUpAbles {

    protected int value;

    public CoinItem(Coordinate2D coordinate2D, Size size, String file, int value) {
        super(coordinate2D, size, file);
        this.value = value;
    };

    public abstract int getValue();
}
