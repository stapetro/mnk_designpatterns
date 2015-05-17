package com.mnknowledge.dp.structural.flyweight;

public class CircleFactory extends ShapeFactory {

    @Override
    protected Shape createNewShape() {
        return new Circle();
    }

}
