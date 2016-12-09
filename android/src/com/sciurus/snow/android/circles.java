package com.sciurus.snow.android;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

/**
 * Created by Braxton on 12/8/2015.
 */
public class circles  {

    ShapeRenderer circle;
    ShapeRenderer circle1;
    ShapeRenderer circle2;
    Random ran;
    int circlex = 250;
    int circley = 1000;
    int speed = 1;
    int speed1 = 2;
    int speed2 = 3;

    int circlex1 = 350;
    int circley1= 1500;

    int circlex2 = 600;
    int circley2 = 800;

    circles() {
        //Creates each indivdual circle
        circle = new ShapeRenderer();
        circle1 = new ShapeRenderer();
        circle2 = new ShapeRenderer();
        ran = new Random();
        circley2 = ran.nextInt(Gdx.graphics.getHeight());

    }


    //Draws the falling snow
    public void draw (float delta) {

        circle.begin(ShapeRenderer.ShapeType.Filled);
        circle.circle(circlex, circley, 25);
        circle.setColor(Color.WHITE);
        circle.end();

        circle1.begin(ShapeRenderer.ShapeType.Filled);
        circle1.circle(circlex1, circley1, 25);
        circle1.setColor(Color.WHITE);
        circle1.end();

        circle2.begin(ShapeRenderer.ShapeType.Filled);
        circle2.circle(circlex2, circley2, 25);
        circle2.setColor(Color.WHITE);
        circle2.end();

    }

    //Updates the Falling Snow movements
    public void update(float delta) {
        circley = circley-speed;
        circley1 = circley1-speed1;
        circley2 = circley2-speed2;

        if (circley<= 0) {
            circley = Gdx.graphics.getHeight()+100;
            circlex = ran.nextInt(Gdx.graphics.getWidth());
            speed = ran.nextInt(4)+1;

        }
        if (circley1<= 0) {
            circley1 = Gdx.graphics.getHeight()+500;
            circlex1 = ran.nextInt(Gdx.graphics.getWidth());
            speed1 = ran.nextInt(5)+1;
        }
        if (circley2<= 0) {
            circley2 = Gdx.graphics.getHeight()+250;
            circlex2 = ran.nextInt(Gdx.graphics.getWidth());
            speed2 = ran.nextInt(7-1)+1;
        }
    }


}
