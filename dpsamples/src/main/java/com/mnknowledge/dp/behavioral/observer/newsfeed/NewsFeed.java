package com.mnknowledge.dp.behavioral.observer.newsfeed;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed implements Subject {

    List<Observer> observersList;
    private String stateChange;

    public NewsFeed() {
        this.observersList = new ArrayList<Observer>();
        stateChange = null;
    }

    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    public void unRegisterObserver(Observer observer) {
        observersList.remove(observer);
    }

    public void notifyObserver() {
        if (stateChange != null) {
            for (Observer observer : observersList) {
                observer.update();
            }
        }
        stateChange = null;
    }

    public Object getUpdate() {
        Object changedState = "";
        if (stateChange != null) {
            changedState = stateChange;
        }
        return changedState;
    }

    public void postNewArticle(String newArticle) {
        stateChange = newArticle;
        notifyObserver();
    }

}
