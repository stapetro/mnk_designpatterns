package com.mnknowledge.dp.flyweight;

import java.awt.Graphics;

public class CircleExtrinsicState implements ExtrinsicState {

    private Graphics graphics;
    private int x;
    private int y;
    private int radius;

    public Graphics getGraphics() {
        return graphics;
    }
    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
