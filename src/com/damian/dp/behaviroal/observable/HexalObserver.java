package com.damian.dp.behaviroal.observable;

public class HexalObserver extends Observer {
    public  HexalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hexal String: " + Integer.toHexString(subject.getState()));
    }
}
