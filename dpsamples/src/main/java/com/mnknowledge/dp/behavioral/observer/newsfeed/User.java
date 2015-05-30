package com.mnknowledge.dp.behavioral.observer.newsfeed;

public class User implements Observer {

    private String name;
    private String article;
    private Subject newsFeed;

    public User(String name) {
        super();
        this.name = name;
    }

    public void subscribe(Subject newsFeed) {
        newsFeed.registerObserver(this);
        this.newsFeed = newsFeed;
        article = "No New Article!";
    }

    @Override
    public void update() {
        System.out.println("State change reported by Subject.");
        article = (String) newsFeed.getUpdate();
    }

    public String getArticle() {
        return article;
    }

    public String getName() {
        return name;
    }
}
