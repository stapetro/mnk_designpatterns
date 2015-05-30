package com.mnknowledge.dp.behavioral.observer.wheather;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
