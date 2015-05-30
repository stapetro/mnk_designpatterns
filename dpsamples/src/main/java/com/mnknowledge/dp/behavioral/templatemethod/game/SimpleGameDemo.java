package com.mnknowledge.dp.behavioral.templatemethod.game;

/**
 * Simple Game Demo, demonstrating sample usage of Template Method Pattern in Java.
 *
 * @author siiliev
 *
 */
public class SimpleGameDemo {
    public static void main(String[] args) {

        SimpleGame game = new Chess();
        game.play();

        System.out.println();
        game = new Tenis();
        game.play();
    }
}
