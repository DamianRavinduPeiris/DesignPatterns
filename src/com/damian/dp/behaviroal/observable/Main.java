package com.damian.dp.behaviroal.observable;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new HexalObserver(subject));
        subject.attach(new BinaryObserver(subject));
        subject.setState(11);



    }
}
