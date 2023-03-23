package com.github.hanyaeger.tutorial.Levels.Level2;

import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.JumpPrince;
import com.github.hanyaeger.tutorial.entities.King.Prince;
import com.github.hanyaeger.tutorial.entities.map.Level2TileMap;
import com.github.hanyaeger.tutorial.entities.text.CoinText;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.entities.text.SpeedMeter;

public class Level2 extends DynamicScene implements TileMapContainer {
    JumpPrince jumpPrince;

    HealthText healthText;
    SpeedMeter speedMeter;
    CoinText coinText;
    Prince prince;

    public Level2(JumpPrince jumpPrince, HealthText healthText, SpeedMeter speedMeter, CoinText coinText, Prince prince){
        this.jumpPrince = jumpPrince;
        this.healthText = healthText;
        this.speedMeter = speedMeter;
        this.coinText = coinText;
        this.prince = prince;
    }

    @Override
    public void setupScene(){
        setBackgroundImage("backgrounds/Level2.png");
    }

    public void setupTileMaps() {
        addTileMap(new Level2TileMap());
    }

    public void setupEntities() {

        addEntity(healthText);

        addEntity(speedMeter);

        addEntity(coinText);

        addEntity(prince);


    }


}
