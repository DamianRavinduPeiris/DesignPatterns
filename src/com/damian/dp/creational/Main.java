package com.damian.dp.creational;

import com.damian.dp.creational.factory.ShapeFactory;
import com.damian.dp.creational.factory.Shapes;

public class Main {
    public static void main(String[] args) {
        ShapeFactory.getShape(Shapes.CIRCLE).draw();
        ShapeFactory.getShape(Shapes.RECTANGLE).draw();
    }
}
