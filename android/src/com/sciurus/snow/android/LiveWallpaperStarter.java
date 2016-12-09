package com.sciurus.snow.android;

/**
 * Created by Braxton on 12/8/2015.
 */
import com.badlogic.gdx.Game;
public class LiveWallpaperStarter extends Game{

    @Override
    public void create() {

        setScreen(new LiveWallpaperScreen(this));
    }

}