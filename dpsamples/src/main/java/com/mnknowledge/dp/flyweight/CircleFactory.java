package com.mnknowledge.dp.flyweight;

public class CircleFactory extends ShapeFactory {

    @Override
    protected Shape createNewShape() {
        return new Circle();
    }

}
