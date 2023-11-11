package com.damian.dp.structural.decorator;

import com.damian.dp.structural.decorator.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("ShapeDecorator::draw()");
    }

}
