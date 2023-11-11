package com.damian.dp.structural;

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;


    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();

    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

}
