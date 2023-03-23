package com.github.hanyaeger.tutorial.entities.SwordFish;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.HitBox;

import java.util.Random;

public class SwordFish extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {
    public SwordFish(Coordinate2D coordinate2D) {
        super(coordinate2D);
        setMotion(2, 270d);
    }

    public void setupEntities() {
        SwordfishSprite swordfishSprite = new SwordfishSprite(new Coordinate2D(0, 0));
        addEntity(swordfishSprite);
        HitBox hitbox = new HitBox(new Coordinate2D(1, 39));
        addEntity(hitbox);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border){
        setAnchorLocationX(getSceneWidth());
        setAnchorLocationY(new Random().nextInt((int) getSceneHeight()- 81));
    }
}
