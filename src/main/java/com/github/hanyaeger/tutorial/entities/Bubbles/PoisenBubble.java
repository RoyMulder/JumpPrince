package com.github.hanyaeger.tutorial.entities.Bubbles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicCircleEntity;
import com.github.hanyaeger.api.media.SoundClip;
import javafx.scene.paint.Color;

public class PoisenBubble extends DynamicCircleEntity implements Collided {

    public PoisenBubble(Coordinate2D coordinate2D, int speed) {
        super(coordinate2D);
        setDirection(270);
        setSpeed(speed);
        setRadius(60);
        setStrokeWidth(5);
        setStrokeColor(Color.LIMEGREEN);
        setFill(Color.DARKGREEN);
    }

    @Override
    public void onCollision(Collider collidingObject){
        var popSound = new SoundClip("audio/pop.mp3");
        popSound.play();

        remove();
    }
}
