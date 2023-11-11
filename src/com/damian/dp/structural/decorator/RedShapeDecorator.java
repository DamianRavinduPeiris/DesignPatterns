package com.damian.dp.structural.decorator;

import com.damian.dp.structural.decorator.Shape;
import com.damian.dp.structural.decorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);

    }
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Red Border implemented : "+decoratedShape.getClass().getName());
    }
}
