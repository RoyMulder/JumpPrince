package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class PlatfromBlock extends SpriteEntity implements Collider {

    public PlatfromBlock(Coordinate2D coordinate2D, Size size, String file) {
        super(file, coordinate2D, size);
    }
}