package com.damian.dp.structural.decorator;

import com.damian.dp.structural.facade.Circle;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        System.out.println("Without Decorator!");
        rectangle.draw();
        Shape rectangle1 =new RedShapeDecorator(rectangle);
        System.out.println("With Decorator!");
        rectangle1.draw();




    }
}
