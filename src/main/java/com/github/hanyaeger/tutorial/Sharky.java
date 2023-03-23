package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Random;

public class Sharky extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, Collider {
    public Sharky(Coordinate2D location){
        super("sprites/sharky.png", location, new Size(60,120), 1, 19);
        setMotion(0.5, 90d);
        setAutoCycle(250);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border){
        setAnchorLocationX(0);
        setAnchorLocationY(new Random().nextInt((int) getSceneHeight()- 81));
    }
}
