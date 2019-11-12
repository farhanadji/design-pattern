package com.farhanadji;

public class SquareBlueFactory extends AbstractFactory {
    @Override
    public Shape getShape() {
        return new Square();
    }

    @Override
    public Color getColor() {
        return new Blue();
    }
}
