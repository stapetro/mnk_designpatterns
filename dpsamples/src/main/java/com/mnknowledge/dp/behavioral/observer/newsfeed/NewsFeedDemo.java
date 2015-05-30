package com.mnknowledge.dp.behavioral.observer.newsfeed;

/**
 * News Feed Demo, demonstrating sample usage of Observer Pattern in Java.
 *
 * @author siiliev
 *
 */
public class NewsFeedDemo {
    public static void main(String args[]) {
        // create news feed
        NewsFeed newsFeed = new NewsFeed();

        // define 2 users
        User user1 = new User("Ivan");
        User user2 = new User("Petar");

        // register/subscribe users for the newsFeed
        user1.subscribe(newsFeed);
        user2.subscribe(newsFeed);

        // check user state
        System.out.println(user1.getName() + " article state: " + user1.getArticle());
        System.out.println(user2.getName() + " article state: " + user2.getArticle());
        System.out.println();

        // post, and check user state
        newsFeed.postNewArticle("Observer Design Pattern Demo");
        System.out.println(user1.getName() + " article state: " + user1.getArticle());
        System.out.println(user2.getName() + " article state: " + user2.getArticle());

        // post again, and check user state
        newsFeed.postNewArticle("Nice News Feed Demo");
        System.out.println(user1.getName() + " article state: " + user1.getArticle());
        System.out.println(user2.getName() + " article state: " + user2.getArticle());
    }
}
