package com.farhanadji;

public class ShapeFactory {

    public Shape getShape(String type){
        Shape shape = null;
        if(type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if(type.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }else if(type.equalsIgnoreCase("square")){
            shape = new Square();
        }

        return shape;
    }
}
