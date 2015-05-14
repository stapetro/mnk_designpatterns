package com.mnknowledge.dp.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public abstract class ShapeFactory {

    private final Map<Color, Shape> shapeByColorPool = new HashMap<>();

    public Shape getShapeBy(Color color) {
        Shape shape = shapeByColorPool.get(color);
        if (shape == null) {
            shape = createNewShape();
            shape.setColor(color);
            shapeByColorPool.put(color, shape);
        }
        return shape;
    }

    protected abstract Shape createNewShape();
}