package com.damian.dp.behaviroal.observable;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setState(11);
        Observer o1 = new HexalObserver(subject);
        Observer o2 = new BinaryObserver(subject);
        o1.update();
        o2.update();


    }
}
