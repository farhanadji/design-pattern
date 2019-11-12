package com.farhanadji;

public class CircleRedFactory extends AbstractFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }

    @Override
    public Color getColor() {
        return new Red();
    }
}
