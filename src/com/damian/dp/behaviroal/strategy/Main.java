package com.damian.dp.behaviroal.strategy;

public class Main {
    public static void main(String[] args) {
        AddOperation addOperation = new AddOperation();
        Context context = new Context(addOperation);
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        SubstractOperation substractOperation = new SubstractOperation();
        context = new Context(substractOperation);
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        context = new Context(multiplyOperation);
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        DivideOperation divideOperation = new DivideOperation();
        context = new Context(divideOperation);
        System.out.println("10 / 5 = " + context.executeStrategy(10, 5));


    }
}
