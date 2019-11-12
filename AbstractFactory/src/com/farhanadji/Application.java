package com.farhanadji;

public class Application {
    private Color color;
    private Shape shape;

    public Application(AbstractFactory abstractFactory){
        color = abstractFactory.getColor();
        shape = abstractFactory.getShape();
    }

    public void print(){
        color.fill();
        shape.draw();
    }
}
