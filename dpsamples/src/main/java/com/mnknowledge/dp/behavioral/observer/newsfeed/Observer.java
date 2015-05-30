package com.mnknowledge.dp.behavioral.observer.newsfeed;

public interface Observer {

    public void update();

    public void subscribe(Subject subject);
}
