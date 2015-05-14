package com.mnknowledge.dp.flyweight;

public class Circle extends Shape {

    @Override
    public void draw(ExtrinsicState state) {
        if (!(state instanceof CircleExtrinsicState)) {
            throw new IllegalArgumentException("Not valid context for circle!");
        }
        CircleExtrinsicState circleContext = (CircleExtrinsicState) state;
        circleContext.getGraphics().setColor(getColor());
        circleContext.getGraphics().drawOval(circleContext.getX(), circleContext.getY(), circleContext.getRadius(),
                circleContext.getRadius());
    }

}
