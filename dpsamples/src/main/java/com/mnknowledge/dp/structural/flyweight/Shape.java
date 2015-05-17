package com.mnknowledge.dp.structural.flyweight;

import java.awt.Color;


public abstract class Shape {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(ExtrinsicState state);
}
