package com.damian.dp.creational.factory;

public class ShapeFactory {
    public static Shape getShape(Shapes shape){
        switch (shape){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;

        }

    }
}
