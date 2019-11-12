package com.farhanadji;

public class RectangleGreenFactory extends AbstractFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }

    @Override
    public Color getColor() {
        return new Green();
    }
}
