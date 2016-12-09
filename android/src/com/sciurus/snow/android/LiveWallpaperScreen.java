package com.sciurus.snow.android;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Braxton on 12/8/2015.
 */
public class LiveWallpaperScreen implements Screen{

    Game game;
    int circlex = 1500;
    int circley = 1000;
    circles circle1;
    circles fallingcircle;
    circles fallingcircle2;
    circles fallingcircle3;
    circles fallingcircle4;
    int particlex = 0;
    int particley = 0;

    OrthographicCamera camera;
    Texture textureBg;
    TextureRegion background;
    SpriteBatch batcher;
    ShapeRenderer circle = new ShapeRenderer();
    ShapeRenderer rect = new ShapeRenderer();

    int height;
    int width;

    public LiveWallpaperScreen(final Game game) {


        //Initilizes the falling snow circles
        this.game = game;
        circle = new ShapeRenderer();
        circle1 = new circles();
        fallingcircle = new circles();
        fallingcircle2 = new circles();
        fallingcircle3 = new circles();
        fallingcircle4 = new circles();

        height = Gdx.graphics.getHeight();
        width = Gdx.graphics.getWidth();

        //Sets up the camera

        camera = new OrthographicCamera(320, 480);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);


        batcher = new SpriteBatch();




    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    private void draw(float delta) {
        //Gdx.gl.glClearColor(153 / 255f, 230 / 255f, 255 / 255, 0.2f);
        Gdx.gl.glClearColor(185 / 254f, 250 / 255f, 255 / 255, 0.2f);
        //Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        camera.update();

        batcher.setProjectionMatrix(camera.combined);

        rect.begin(ShapeRenderer.ShapeType.Filled);
        rect.rect(0,0,width,height/10);
        rect.setColor(Color.WHITE);
        rect.end();


    }


    private void update(float delta) {
        circle1.update(delta);
        fallingcircle.update(delta);
        fallingcircle2.update(delta);
        fallingcircle3.update(delta);
        fallingcircle4.update(delta);


    }


    @Override
    public void render(float delta) {

        //Updates the movement of the falling snow
        update(delta);
        draw(delta);
        circle1.draw(delta);
        fallingcircle.draw(delta);
        fallingcircle2.draw(delta);
        fallingcircle3.draw(delta);
        fallingcircle4.draw(delta);

    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }


}
