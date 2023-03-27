package com.github.hanyaeger.tutorial.entities.map.Interactable.Items;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.tutorial.entities.map.Interactable.Interactable;

public abstract class PickUpAbles extends Interactable {

    public PickUpAbles(Coordinate2D coordinate2D, Size size, String file) {
        super(coordinate2D, size, file);
    };

    public abstract void onPickUp();
}
