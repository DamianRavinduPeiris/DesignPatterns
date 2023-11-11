package com.damian.dp.behaviroal.observable;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observersList = new ArrayList<>();
    private int state;



    public List<Observer> getObserversList() {
        return observersList;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();

    }
    public void attach(Observer observer) {
        observersList.add(observer);
    }
    public void notifyAllObservers() {
        for (Observer observer : observersList) {
            observer.update();
        }
    }


}
